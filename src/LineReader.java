import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LineReader { //Парсер, который съедает вводимые данные, парсит их на символы и запихивает в список
    public static ArrayList<String> array = new ArrayList<>();
    public static ArrayList<String> letters = new ArrayList<>();

    public void lineReader(){
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Вводите текст для шифровки. После окончания ввода наберите exit.");

        while (scanner.hasNext()){
            text = scanner.next();
            if (text.equals("exit"))
                break;
            array.add(text);

        }
    }
    public void charsParser(){ //Для шифровки букв
        String[] temp;
        for (String str : array){
            temp=str.split("");
            Collections.addAll(letters, temp);
        }
    }
    public void codeParser(){ //Для дешифровки кодов
        String[] temp;
        for (String str : array){
            temp=str.split(" ");
            Collections.addAll(letters, temp);
        }
    }
}
