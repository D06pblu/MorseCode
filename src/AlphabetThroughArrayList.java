import java.util.ArrayList;

public class AlphabetThroughArrayList { //Задаем алфавит и кодировку с помощью двух списков, поиск производим через индексы
    static ArrayList<String> chars = new ArrayList<>();
    static ArrayList<String> codes = new ArrayList<>();

public static void setChars(){
    chars.add("А");
    chars.add("Б");
    chars.add("В");
    chars.add("Г");
    chars.add("Д");
    chars.add("Е");
    chars.add("Ж");
    chars.add("З");
    chars.add("И");
    chars.add("Й");
    chars.add("К");
    chars.add("Л");
    chars.add("М");
    chars.add("Н");
    chars.add("О");
    chars.add("П");
    chars.add("Р");
    chars.add("С");
    chars.add("Т");
    chars.add("У");
    chars.add("Ф");
    chars.add("Х");
    chars.add("Ц");
    chars.add("Ч");
    chars.add("Ш");
    chars.add("Щ");
    chars.add("Ь");
    chars.add("Ы");
    chars.add("Э");
    chars.add("Ю");
    chars.add("Я");

    chars.add("1");
    chars.add("2");
    chars.add("3");
    chars.add("4");
    chars.add("5");
    chars.add("6");
    chars.add("7");
    chars.add("8");
    chars.add("9");
    chars.add("0");

    chars.add(".");
    chars.add(",");
    chars.add(" ");
    chars.add(";");
    chars.add(":");
    chars.add("?");
    chars.add("!");
    chars.add("-");
    chars.add("QUOTATION");
    chars.add("(");
    chars.add("/");
}
static void setCodes(){
    codes.add("та-пиии");
    codes.add("пиии-та-та-та");
    codes.add("та-пиии-пиии");
    codes.add("пиии-пиии-та");
    codes.add("пиии-та-та");
    codes.add("та");
    codes.add("та-та-та-пиии");
    codes.add("пиии-пиии-та-та");
    codes.add("та-та");
    codes.add("та-пиии-пиии-пиии");
    codes.add("пиии-та-пиии");
    codes.add("та-пиии-та-та");
    codes.add("пиии-пиии");
    codes.add("пиии-та");
    codes.add("пиии-пиии-пиии");
    codes.add("та-пиии-пиии-та");
    codes.add("та-пиии-та");
    codes.add("та-та-та");
    codes.add("пиии");
    codes.add("та-та-пиии");
    codes.add("та-та-пиии-та");
    codes.add("та-та-та-та");
    codes.add("пиии-та-пиии-та");
    codes.add("пиии-пиии-пиии-та");
    codes.add("пиии-пиии-пиии-пиии");
    codes.add("пиии-пиии-та-пиии");
    codes.add("пиии-та-та-пиии");
    codes.add("пиии-та-пиии-пиии");
    codes.add("та-та-пиии-та-та");
    codes.add("та-та-пиии-пиии");
    codes.add("та-пиии-та-пиии");

    codes.add("та-пиии-пиии-пиии-пиии");
    codes.add("та-та-пиии-пиии-пиии");
    codes.add("та-та-та-пиии-пиии");
    codes.add("та-та-та-та-пиии");
    codes.add("та-та-та-та-та");
    codes.add("пиии-та-та-та-та");
    codes.add("пиии-пиии-та-та-та");
    codes.add("пиии-пиии-пиии-та-та");
    codes.add("пиии-пиии-пиии-пиии-та");
    codes.add("пиии-пиии-пиии-пиии-пиии");

    codes.add("та-та-та-та-та-та");
    codes.add("та-пиии-та-пиии-та-пиии");
    codes.add(" ");
    codes.add("пиии-та-пиии-та-пиии-та");
    codes.add("пиии-пиии-пиии-та-та-та");
    codes.add("та-та-пиии-пиии-та-та");
    codes.add("пиии-пиии-та-та-пиии-пиии");
    codes.add("пиии-та-та-та-та-пиии");
    codes.add("та-пиии-та-та-пиии-та");
    codes.add("пиии-та-пиии-пиии-та-пиии");
    codes.add("пиии-та-та-пиии-та");

}

    public static void biper(String symbol) { //Переводит символы в код
        System.out.print(codes.get(chars.indexOf(symbol)) + " ");
    }

    public static void typer(String code){ //Переводит коды в символы
        System.out.print(chars.get(codes.indexOf(code)));
    }
}
