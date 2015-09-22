package challenge.character_manipulation.supplier.impl;

import challenge.character_manipulation.supplier.CharacterArrayFromStringSupplier;

public class DefaultCharacterArrayFromStringSupplier implements CharacterArrayFromStringSupplier{

    public char[] get(final String string){
        return string.toCharArray();
    }
}
