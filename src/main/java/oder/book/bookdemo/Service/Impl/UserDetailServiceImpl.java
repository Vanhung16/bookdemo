package oder.book.bookdemo.Service.Impl;

import oder.book.bookdemo.domain.User;
import oder.book.bookdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(username, user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole()));
        return userDetails;
    }
}
