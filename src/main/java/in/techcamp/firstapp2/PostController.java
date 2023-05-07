package in.techcamp.firstapp2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(){
        return "hello";
    }

    @GetMapping
    public String showList(Model model) {
        var postList = List.of(
                new PostEntity(1, "投稿１"),
                new PostEntity(2, "投稿２"),
                new PostEntity(3, "投稿３")
        );
        model.addAttribute("postList", postList);
        return "index";
    }
}
