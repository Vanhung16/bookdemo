package oder.book.bookdemo.controllers;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.domain.User;
import oder.book.bookdemo.dtos.UserDTO;
import oder.book.bookdemo.repositories.UserRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    IUserService userService;

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;
    @GetMapping("/welcome")
    public String view(){
        return "/user/welcome";
    }
//    @GetMapping("login")
//    public String login(ModelMap model){
//        model.addAttribute("user", new UserDTO());
//        return "login";
//    }


    @GetMapping(value = "signUp")
    public String add(ModelMap model){
        model.addAttribute("user", new UserDTO());
        return "/user/signUp";
    }
    

    @RequestMapping(value="signUp")
    public ModelAndView getMethodName(ModelMap model, @Valid @ModelAttribute("user") UserDTO dto, BindingResult result) {
        
        if(result.hasErrors()){
            return new ModelAndView("/user/signUp", model);
        }
        User user = new User();
        BeanUtils.copyProperties(dto, user);
        user.setPassword(encoder.encode(dto.getPassword()));
        System.out.println(user.getPassword());
        userRepository.save(user);
        model.addAttribute("message","account craeted");
        return new ModelAndView("redirect:/login", model);
    }
    

}
