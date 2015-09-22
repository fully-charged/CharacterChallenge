package challenge.input.source.factory.impl;

import challenge.input.source.ConsoleStringInputSource;
import challenge.input.source.StringInputSource;
import challenge.input.source.factory.StringInputSourceFactory;

public class DefaultStringInputSourceFactory extends StringInputSourceFactory{

    protected StringInputSource supply(){
        return new ConsoleStringInputSource();
    }
}
