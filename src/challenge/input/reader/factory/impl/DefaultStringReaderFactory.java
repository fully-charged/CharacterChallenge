package challenge.input.reader.factory.impl;

import challenge.input.reader.StringReader;
import challenge.input.reader.factory.StringReaderFactory;
import challenge.input.reader.validation.impl.NonEmptyStringValidationRule;
import challenge.input.reader.validation.impl.NonNullStringValidationRule;
import challenge.input.source.StringInputSource;
import challenge.output.StringOutputSource;

public class DefaultStringReaderFactory extends StringReaderFactory{

    public StringReader get(final StringOutputSource prompter, final StringInputSource source){
        final StringReader reader = new StringReader(prompter, source);
        reader.getValidationRules().addValidationRule(new NonNullStringValidationRule());
        reader.getValidationRules().addValidationRule(new NonEmptyStringValidationRule());
        return reader;
    }
}
