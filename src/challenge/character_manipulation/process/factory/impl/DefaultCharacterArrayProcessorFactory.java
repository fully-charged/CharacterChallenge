package challenge.character_manipulation.process.factory.impl;

import challenge.character_manipulation.process.CharacterArrayProcessor;
import challenge.character_manipulation.process.factory.CharacterArrayProcessorFactory;
import challenge.character_manipulation.process.impl.DefaultCharacterArrayProcessor;

public class DefaultCharacterArrayProcessorFactory extends CharacterArrayProcessorFactory{

    protected CharacterArrayProcessor supply(){
        return new DefaultCharacterArrayProcessor();
    }
}
