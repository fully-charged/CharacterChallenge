package challenge.input.source.factory;

import challenge.input.source.StringInputSource;
import challenge.input.source.factory.impl.DefaultStringInputSourceFactory;
import challenge.factory_util.LazyFactory;

public abstract class StringInputSourceFactory extends LazyFactory<StringInputSource>{

    private static final LazyFactory<StringInputSourceFactory> DEFAULT = new LazyFactory<StringInputSourceFactory>(){
        protected StringInputSourceFactory supply(){
            return new DefaultStringInputSourceFactory();
        }
    };

    public static StringInputSourceFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
