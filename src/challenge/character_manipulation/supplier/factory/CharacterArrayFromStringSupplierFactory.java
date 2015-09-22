package challenge.character_manipulation.supplier.factory;

import challenge.character_manipulation.supplier.CharacterArrayFromStringSupplier;
import challenge.character_manipulation.supplier.factory.impl.DefaultCharacterArrayFromStringSupplierFactory;
import challenge.factory_util.LazyFactory;

public abstract class CharacterArrayFromStringSupplierFactory extends LazyFactory<CharacterArrayFromStringSupplier>{

    private static final LazyFactory<CharacterArrayFromStringSupplierFactory> DEFAULT = new LazyFactory<CharacterArrayFromStringSupplierFactory>(){
        protected CharacterArrayFromStringSupplierFactory supply(){
            return new DefaultCharacterArrayFromStringSupplierFactory();
        }
    };

    public static CharacterArrayFromStringSupplierFactory getDefaultInstance(){
        return DEFAULT.get();
    }
}
