package challenge.input.reader;

import challenge.output.StringOutputSource;
import challenge.input.reader.validation.StringValidationRules;
import challenge.input.source.StringInputSource;

public class StringReader{

    private final StringOutputSource prompter;
    private final StringInputSource source;

    private final StringValidationRules rules;

    public StringReader(final StringOutputSource prompter, final StringInputSource source){
        this.prompter = prompter;
        this.source = source;

        rules = new StringValidationRules();
    }

    public StringOutputSource getPrompter(){
        return prompter;
    }

    public StringInputSource getSource(){
        return source;
    }

    public StringValidationRules getValidationRules(){
        return rules;
    }

    public String read(){
        String string;
        do{
            prompter.put("Enter a string");
            string = source.get();
        }while(!rules.isValid(string));
        return string;
    }
}
