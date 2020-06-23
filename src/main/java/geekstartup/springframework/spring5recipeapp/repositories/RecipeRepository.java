package geekstartup.springframework.spring5recipeapp.repositories;

import geekstartup.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 23-Jun-2020||4:35 PM
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
