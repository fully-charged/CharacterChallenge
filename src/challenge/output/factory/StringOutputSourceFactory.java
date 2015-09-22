package challenge.output.factory;

import challenge.output.StringOutputSource;
import challenge.output.factory.impl.DefaultStringOutputSourceFactory;
import challenge.factory_util.LazyFactory;

public abstract class StringOutputSourceFactory extends LazyFactory<StringOutputSource>{

    private static final LazyFactory<StringOutputSourceFactory> DEFAULT = new LazyFactory<StringOutputSourceFactory>(){
        protected StringOutputSourceFactory supply(){
            return new DefaultStringOutputSourceFactory();
        }
    };

    public static StringOutputSourceFactory getDefaultInstance(){
        return DEFAULT.get();
    }

}
