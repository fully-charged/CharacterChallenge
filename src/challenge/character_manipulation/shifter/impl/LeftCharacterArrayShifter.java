package challenge.character_manipulation.shifter.impl;

import challenge.character_manipulation.shifter.CharacterArrayShifter;

public class LeftCharacterArrayShifter implements CharacterArrayShifter{

    public void shift(final char[] chars){
        final char first = chars[0];
        for(int i = 1; i < chars.length; i++)
            chars[i-1] = chars[i];
        chars[chars.length-1] = first;
    }
}
