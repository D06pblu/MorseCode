import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Alphabet.setAlph();
        LineReader lineReader = new LineReader();
        lineReader.lineReader();
        lineReader.arrayParser();
        for (String s : LineReader.letters){
            Alphabet.biper(s.toUpperCase());
        }
    }
}

