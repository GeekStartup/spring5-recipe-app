package geekstartup.springframework.spring5recipeapp.repositories;

import geekstartup.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by ashishnayak on 23-Jun-2020||4:36 PM
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
