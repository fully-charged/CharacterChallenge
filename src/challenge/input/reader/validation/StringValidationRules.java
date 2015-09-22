package challenge.input.reader.validation;

import java.util.ArrayList;
import java.util.List;

public class StringValidationRules{

    private final List<StringValidationRule> rules;

    public StringValidationRules(){
        rules = new ArrayList<>();
    }

    public void addValidationRule(final StringValidationRule rule){
        rules.add(rule);
    }

    public boolean isValid(final String string){
        return rules.stream().allMatch(rule -> rule.test(string));
    }

}
