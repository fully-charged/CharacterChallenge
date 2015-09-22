package challenge;

import challenge.character_manipulation.holder.CharacterArrayHolder;
import challenge.character_manipulation.holder.factory.CharacterArrayHolderFactory;
import challenge.character_manipulation.process.CharacterArrayProcessor;
import challenge.character_manipulation.process.factory.CharacterArrayProcessorFactory;
import challenge.character_manipulation.shifter.CharacterArrayShifter;
import challenge.character_manipulation.shifter.factory.CharacterArrayShifterFactory;
import challenge.character_manipulation.supplier.CharacterArrayFromStringSupplier;
import challenge.character_manipulation.supplier.factory.CharacterArrayFromStringSupplierFactory;
import challenge.character_util.CharacterTable;
import challenge.input.reader.StringReader;
import challenge.input.reader.factory.StringReaderFactory;
import challenge.input.source.StringInputSource;
import challenge.input.source.factory.StringInputSourceFactory;
import challenge.output.StringOutputSource;
import challenge.output.factory.StringOutputSourceFactory;

public class Main{

    public static void main(String[] args){
        final StringOutputSource output = StringOutputSourceFactory.getDefaultInstance().get();
        final StringInputSource input = StringInputSourceFactory.getDefaultInstance().get();
        final CharacterArrayHolderFactory holderFactory = CharacterArrayHolderFactory.getDefaultInstance();
        final CharacterArrayFromStringSupplier supplier = CharacterArrayFromStringSupplierFactory.getDefaultInstance().get();
        final CharacterArrayShifter shifter = CharacterArrayShifterFactory.getDefaultInstance().get();
        final CharacterArrayProcessor processor = CharacterArrayProcessorFactory.getDefaultInstance().get();
        final StringReader reader = StringReaderFactory.getDefaultInstance().get(output, input);

        final String string = reader.read();
        final char[] chars = supplier.get(string);
        final CharacterArrayHolder holder = holderFactory.get(chars);
        final CharacterTable table = processor.process(holder, shifter);
        output.put("Original string: " + string);
        output.put(table.toString(" | "));
    }
}
