package challenge.input.source;

import java.util.Scanner;

public class ConsoleStringInputSource implements StringInputSource{

    public String get(){
        try(final Scanner input = new Scanner(System.in)){
            final String line = input.nextLine().trim();
            return line.isEmpty() ? null : line;
        }
    }
}
