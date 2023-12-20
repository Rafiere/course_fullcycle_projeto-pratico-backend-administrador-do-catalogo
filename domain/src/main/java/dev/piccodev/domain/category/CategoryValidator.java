package dev.piccodev.domain.category;

import dev.piccodev.domain.validation.Error;
import dev.piccodev.domain.validation.ValidationHandler;
import dev.piccodev.domain.validation.Validator;

/* Os validadores tendem a mudar de uma forma diferente das entidades, dessa
* forma, criamos uma classe externa para não modificarmos o domínio. */
public class CategoryValidator extends Validator {

    private final Category category;
    private final int NAME_MAX_LENGTH = 255;
    private final int NAME_MIN_LENGTH = 3;

    public CategoryValidator(final Category category,
                             final ValidationHandler validationHandler){

        super(validationHandler);
        this.category = category;
    }

    @Override
    public void validate() {

        checkNameConstraints();
    }

    private void checkNameConstraints() {

        final var name = this.category.getName();

        if(name == null){
            this.validationHandler().append(new Error("'name' should not be null"));
            return;
        }

        if(name.isBlank()){
            this.validationHandler().append(new Error("'name' should not be empty"));
            return;
        }

        final int length = name.trim().length();
        if(length > NAME_MAX_LENGTH || length < NAME_MIN_LENGTH){
            this.validationHandler().append(new Error("'name' must be between 3 and 255 characters"));
        }
    }
}
