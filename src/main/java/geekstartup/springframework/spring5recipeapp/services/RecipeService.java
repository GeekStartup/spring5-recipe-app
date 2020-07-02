package geekstartup.springframework.spring5recipeapp.services;

import geekstartup.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by ashishnayak on 23-Jun-2020||9:44 PM
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe getRecipeById(Long id);
}
