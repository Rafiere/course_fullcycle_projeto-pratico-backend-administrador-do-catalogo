package dev.piccodev.domain.category;

import dev.piccodev.domain.validation.Error;
import dev.piccodev.domain.validation.ValidationHandler;
import dev.piccodev.domain.validation.Validator;

/* Os validadores tendem a mudar de uma forma diferente das entidades, dessa
* forma, criamos uma classe externa para não modificarmos o domínio. */
public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category category,
                             final ValidationHandler validationHandler){

        super(validationHandler);
        this.category = category;
    }

    @Override
    public void validate() {

        if(this.category.getName() == null){
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
