package oder.book.bookdemo.configs;

import oder.book.bookdemo.Service.Impl.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSercurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired(required = true)
    UserDetailServiceImpl userDetailService;

    @Bean // configure to crypto
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService) // cung cap userService cho spring sercurity
                .passwordEncoder(bCryptPasswordEncoder());// cung cap password encoder(mat khau duoc ma hoa)
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/hello").permitAll()// /hello được truy cập mà ko cần authentication
                .and()
                .authorizeRequests()
                .anyRequest().authenticated() // cac thu con lai can phai authentication mới được truy cập
                .and()
                .formLogin() // từ form đăng nhập
                .loginPage("/login")
                .defaultSuccessUrl("/welcome").permitAll() // mặc định thành công sẽ truy cập /welcome
                .and()
                .logout()
                .permitAll();
    }
}
