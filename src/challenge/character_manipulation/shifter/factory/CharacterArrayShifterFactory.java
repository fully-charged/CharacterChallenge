package challenge.character_manipulation.shifter.factory;

import challenge.character_manipulation.shifter.CharacterArrayShifter;
import challenge.character_manipulation.shifter.factory.impl.DefaultCharacterArrayShifterFactory;
import challenge.factory_util.LazyFactory;

public abstract class CharacterArrayShifterFactory extends LazyFactory<CharacterArrayShifter>{

    private static final LazyFactory<CharacterArrayShifterFactory> DEFAULT = new LazyFactory<CharacterArrayShifterFactory>(){
        protected CharacterArrayShifterFactory supply(){
            return new DefaultCharacterArrayShifterFactory();
        }
    };

    public static CharacterArrayShifterFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
