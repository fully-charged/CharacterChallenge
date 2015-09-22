package challenge.output.factory.impl;

import challenge.output.ConsoleStringOutputSource;
import challenge.output.StringOutputSource;
import challenge.output.factory.StringOutputSourceFactory;

public class DefaultStringOutputSourceFactory extends StringOutputSourceFactory{

    protected StringOutputSource supply(){
        return new ConsoleStringOutputSource();
    }
}
