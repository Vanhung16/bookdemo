package oder.book.bookdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class BookController {
    @GetMapping("/list")
    public String viewList(){
        return "user/listBook";
    }
}
