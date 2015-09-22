package challenge.input.reader.validation.impl;

import challenge.input.reader.validation.StringValidationRule;

public class NonNullStringValidationRule implements StringValidationRule{

    public boolean test(final String s){
        return s != null;
    }
}
