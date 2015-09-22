package challenge.character_manipulation.holder.factory.impl;

import challenge.character_manipulation.holder.CharacterArrayHolder;
import challenge.character_manipulation.holder.factory.CharacterArrayHolderFactory;
import challenge.character_manipulation.holder.impl.DefaultCharacterArrayHolder;

public class DefaultCharacterArrayHolderFactory extends CharacterArrayHolderFactory{

    public CharacterArrayHolder get(final char[] chars){
        return new DefaultCharacterArrayHolder(chars);
    }
}
