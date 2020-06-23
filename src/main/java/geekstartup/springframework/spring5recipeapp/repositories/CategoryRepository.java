package geekstartup.springframework.spring5recipeapp.repositories;

import geekstartup.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 23-Jun-2020||4:36 PM
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
