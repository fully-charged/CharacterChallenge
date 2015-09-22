package challenge.character_manipulation.holder.factory;

import challenge.character_manipulation.holder.CharacterArrayHolder;
import challenge.character_manipulation.holder.factory.impl.DefaultCharacterArrayHolderFactory;
import challenge.factory_util.LazyFactory;

public abstract class CharacterArrayHolderFactory {

    private static final LazyFactory<CharacterArrayHolderFactory> DEFAULT = new LazyFactory<CharacterArrayHolderFactory>(){
        protected CharacterArrayHolderFactory supply(){
            return new DefaultCharacterArrayHolderFactory();
        }
    };

    public abstract CharacterArrayHolder get(final char[] chars);

    public static CharacterArrayHolderFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
