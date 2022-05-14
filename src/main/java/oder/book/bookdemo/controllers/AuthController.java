package oder.book.bookdemo.controllers;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.Service.Impl.UserDetailServiceImpl;
import oder.book.bookdemo.domain.User;
import oder.book.bookdemo.dtos.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class AuthController {
    @Autowired
    private IUserService userService;

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Autowired
    PasswordEncoder passwordEncoder;

     @GetMapping("login")
     public String login(ModelMap model){
         model.addAttribute("user",new UserDTO());
         return "login";
     }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login( @Valid @ModelAttribute("user") UserDTO userDTO){


        User user = userService.findByUsername(userDetailService.loadUserByUsername(userDTO.getUsername()).getUsername());
        if(user.getRole() == "USER"){
            return "user/welcome";
        }else{
            return "admin/hello";
        }
    }
    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String addUser(ModelMap model){
        model.addAttribute("user", new UserDTO());
        return "/user/signUp";
    }

}
