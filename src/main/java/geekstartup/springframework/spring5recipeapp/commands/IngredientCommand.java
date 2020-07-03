package geekstartup.springframework.spring5recipeapp.commands;

import geekstartup.springframework.spring5recipeapp.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by ashishnayak on 03-Jul-2020||1:56 PM
 */
@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
}
