package challenge.character_manipulation.holder;

import java.util.function.Supplier;

public interface CharacterArrayHolder extends Supplier<char[]>{

    default int length(){
        return get().length;
    }
}
