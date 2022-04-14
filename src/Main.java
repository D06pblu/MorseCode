import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alphabet.setAlph();
        AlphabetThroughArrayList.setChars();
        AlphabetThroughArrayList.setCodes();
        System.out.println("Для зашифровки послания введите 1. Для дешифровки введите 2.");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        LineReader lineReader = new LineReader();
        switch (i) {        //Выбираем какую операцию запускать
            case 1:         //Зашифровку
                lineReader.lineReader();
                lineReader.charsParser();
                for (String s : LineReader.letters) {
                    AlphabetThroughArrayList.biper(s.toUpperCase());
                }
                break;
            case 2:         //Расшифровку
                lineReader.lineReader();
                lineReader.codeParser();
                for (String s : LineReader.letters) {
                    AlphabetThroughArrayList.typer(s);
                }
                break;
        }
    }
}

