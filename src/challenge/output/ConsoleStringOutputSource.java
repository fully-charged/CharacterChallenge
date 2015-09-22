package challenge.output;

public class ConsoleStringOutputSource implements StringOutputSource{

    public void put(final String prompt){
        System.out.println(prompt);
    }
}
