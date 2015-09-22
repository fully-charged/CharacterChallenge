package challenge.character_manipulation.process;

import challenge.character_manipulation.holder.CharacterArrayHolder;
import challenge.character_manipulation.shifter.CharacterArrayShifter;
import challenge.character_util.CharacterTable;

public interface CharacterArrayProcessor{

    CharacterTable process(final CharacterArrayHolder chars, final CharacterArrayShifter shifter);
}
