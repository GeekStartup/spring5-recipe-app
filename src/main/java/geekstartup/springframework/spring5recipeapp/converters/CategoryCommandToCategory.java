package geekstartup.springframework.spring5recipeapp.converters;

import geekstartup.springframework.spring5recipeapp.commands.CategoryCommand;
import geekstartup.springframework.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by ashishnayak on 03-Jul-2020||2:04 PM
 */
@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand categoryCommand) {
        final Category category = new Category();
        category.setId(categoryCommand.getId());
        category.setDescription(categoryCommand.getDescription());
        return category;
    }
}
