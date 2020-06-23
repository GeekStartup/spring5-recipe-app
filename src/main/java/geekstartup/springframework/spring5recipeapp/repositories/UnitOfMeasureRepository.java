package geekstartup.springframework.spring5recipeapp.repositories;

import geekstartup.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 23-Jun-2020||4:38 PM
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
