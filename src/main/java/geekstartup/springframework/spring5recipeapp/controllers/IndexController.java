package geekstartup.springframework.spring5recipeapp.controllers;

import geekstartup.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashishnayak on 20-Jun-2020||9:09 PM
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexpage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
