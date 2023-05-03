package in.techcamp.firstapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(){
        return "hello";
    }

    @GetMapping
    public String showList(){
        return "index";
    }
}
