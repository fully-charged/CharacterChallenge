package challenge.character_manipulation.supplier.factory.impl;

import challenge.character_manipulation.supplier.CharacterArrayFromStringSupplier;
import challenge.character_manipulation.supplier.factory.CharacterArrayFromStringSupplierFactory;
import challenge.character_manipulation.supplier.impl.DefaultCharacterArrayFromStringSupplier;

public class DefaultCharacterArrayFromStringSupplierFactory extends CharacterArrayFromStringSupplierFactory{

    protected CharacterArrayFromStringSupplier supply(){
        return new DefaultCharacterArrayFromStringSupplier();
    }
}
