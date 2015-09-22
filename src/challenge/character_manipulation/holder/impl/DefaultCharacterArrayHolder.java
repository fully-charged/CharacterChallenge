package challenge.character_manipulation.holder.impl;

import challenge.character_manipulation.holder.CharacterArrayHolder;

public class DefaultCharacterArrayHolder implements CharacterArrayHolder{

    private final char[] original;
    private final char[] copy;

    public DefaultCharacterArrayHolder(final char[] original){
        this.original = original;

        copy = original.clone();
    }

    public char[] getOriginal(){
        return original;
    }

    public char[] getCopy(){
        return copy;
    }

    public char[] get(){
        return copy;
    }
}
