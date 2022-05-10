package oder.book.bookdemo.controllers;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.Service.Impl.UserDetailServiceImpl;
import oder.book.bookdemo.dtos.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.Validate;

@Controller
@RequestMapping("")
public class AuthController {
    @Autowired
    private IUserService userService;

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Autowired
    PasswordEncoder passwordEncoder;

    // @GetMapping("login")
    // public String login(ModelMap model){
    //     model.addAttribute("user",new UserDTO());
    //     return "login";
    // }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(ModelMap model, @Validated @ModelAttribute("user") UserDTO userDTO, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("/login", model);
        }


        return null;
    }
    @RequestMapping("/signUp")
    public String create(){
        return "signUp";
    }

}
