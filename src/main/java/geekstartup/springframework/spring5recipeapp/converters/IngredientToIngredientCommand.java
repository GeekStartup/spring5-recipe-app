package geekstartup.springframework.spring5recipeapp.converters;

import geekstartup.springframework.spring5recipeapp.commands.IngredientCommand;
import geekstartup.springframework.spring5recipeapp.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by ashishnayak on 03-Jul-2020||2:36 PM
 */
@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {

        final IngredientCommand ingredientCommand = new IngredientCommand();

        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setUom(ingredient.getUom());

        return ingredientCommand;
    }
}
