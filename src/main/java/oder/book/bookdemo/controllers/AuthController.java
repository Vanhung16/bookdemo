package oder.book.bookdemo.controllers;

import oder.book.bookdemo.Service.IUserService;
import oder.book.bookdemo.Service.Impl.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AuthController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
