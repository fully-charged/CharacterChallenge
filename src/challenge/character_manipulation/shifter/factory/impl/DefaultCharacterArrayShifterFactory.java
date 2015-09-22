package challenge.character_manipulation.shifter.factory.impl;

import challenge.character_manipulation.shifter.CharacterArrayShifter;
import challenge.character_manipulation.shifter.factory.CharacterArrayShifterFactory;
import challenge.character_manipulation.shifter.impl.LeftCharacterArrayShifter;

public class DefaultCharacterArrayShifterFactory extends CharacterArrayShifterFactory{

    protected CharacterArrayShifter supply(){
        return new LeftCharacterArrayShifter();
    }
}
