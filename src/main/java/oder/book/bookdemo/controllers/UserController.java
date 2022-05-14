package oder.book.bookdemo.controllers;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.domain.User;
import oder.book.bookdemo.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    IUserService userService;

//    @GetMapping("login")
//    public String login(ModelMap model){
//        model.addAttribute("user", new UserDTO());
//        return "login";
//    }
//    @PostMapping("login")
//    public ModelAndView login(ModelMap model, @Valid @ModelAttribute("user") UserDTO dto, BindingResult result){
//
//        if(result.hasErrors()){
//            return new ModelAndView("/login", model);
//        }
//        User =
//        return null;
//    }

}
