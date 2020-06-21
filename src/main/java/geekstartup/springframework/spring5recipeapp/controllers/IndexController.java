package geekstartup.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashishnayak on 20-Jun-2020||9:09 PM
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexpage() {
        System.out.println("asssddffff5555555551111111");
        return "index";
    }

}
