package challenge.character_manipulation.process.impl;

import challenge.character_manipulation.holder.CharacterArrayHolder;
import challenge.character_manipulation.process.CharacterArrayProcessor;
import challenge.character_manipulation.shifter.CharacterArrayShifter;
import challenge.character_util.CharacterTable;

public class DefaultCharacterArrayProcessor implements CharacterArrayProcessor{

    public CharacterTable process(final CharacterArrayHolder chars, final CharacterArrayShifter shifter){
        final int length = chars.length();
        final CharacterTable table = new CharacterTable(length, length);
        table.setRow(0, chars.get());
        for(int i = 1; i < length; i++){
            shifter.shift(chars.get());
            table.setRow(i, chars.get());
        }
        return table;
    }
}
