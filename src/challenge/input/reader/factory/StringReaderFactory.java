package challenge.input.reader.factory;

import challenge.factory_util.LazyFactory;
import challenge.input.reader.StringReader;
import challenge.input.reader.factory.impl.DefaultStringReaderFactory;
import challenge.input.source.StringInputSource;
import challenge.output.StringOutputSource;

public abstract class StringReaderFactory {

    private static final LazyFactory<StringReaderFactory> DEFAULT = new LazyFactory<StringReaderFactory>(){
        protected StringReaderFactory supply(){
            return new DefaultStringReaderFactory();
        }
    };

    public abstract StringReader get(final StringOutputSource prompter, final StringInputSource source);

    public static StringReaderFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
