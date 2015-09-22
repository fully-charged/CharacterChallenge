package challenge.character_manipulation.process.factory;

import challenge.character_manipulation.process.CharacterArrayProcessor;
import challenge.character_manipulation.process.factory.impl.DefaultCharacterArrayProcessorFactory;
import challenge.factory_util.LazyFactory;

public abstract class CharacterArrayProcessorFactory extends LazyFactory<CharacterArrayProcessor>{

    private static final LazyFactory<CharacterArrayProcessorFactory> DEFAULT = new LazyFactory<CharacterArrayProcessorFactory>(){
        protected CharacterArrayProcessorFactory supply(){
            return new DefaultCharacterArrayProcessorFactory();
        }
    };

    public static CharacterArrayProcessorFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
