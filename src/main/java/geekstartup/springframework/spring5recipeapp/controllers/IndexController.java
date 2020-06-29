package geekstartup.springframework.spring5recipeapp.controllers;

import geekstartup.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashishnayak on 20-Jun-2020||9:09 PM
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexpage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("Getting Index page..");
        return "index";
    }

}
