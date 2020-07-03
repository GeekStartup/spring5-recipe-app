package geekstartup.springframework.spring5recipeapp.converters;

import geekstartup.springframework.spring5recipeapp.commands.IngredientCommand;
import geekstartup.springframework.spring5recipeapp.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by ashishnayak on 03-Jul-2020||2:19 PM
 */
@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientCommand ingredientCommand) {

        final Ingredient ingredient = new Ingredient();

        ingredient.setAmount(ingredientCommand.getAmount());
        ingredient.setDescription(ingredientCommand.getDescription());
        ingredient.setId(ingredientCommand.getId());
        ingredient.setUom(ingredientCommand.getUom());

        return ingredient;
    }
}
