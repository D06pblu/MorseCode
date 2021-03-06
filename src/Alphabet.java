import java.util.HashMap;

public class Alphabet {
    static HashMap<String, String> alph = new HashMap<>();

    public static void setAlph() {
        alph.put("А", "та-пиии ");
        alph.put("Б", "пиии-та-та-та ");
        alph.put("В", "та-пиии-пиии ");
        alph.put("Г", "пиии-пиии-та ");
        alph.put("Д", "пиии-та-та ");
        alph.put("Е", "та ");
        alph.put("Ж", "та-та-та-пиии ");
        alph.put("З", "пиии-пиии-та-та ");
        alph.put("И", "та-та ");
        alph.put("Й", "та-пиии-пиии-пиии ");
        alph.put("К", "пиии-та-пиии ");
        alph.put("Л", "та-пиии-та-та ");
        alph.put("М", "пиии-пиии ");
        alph.put("Н", "пиии-та ");
        alph.put("О", "пиии-пиии-пиии ");
        alph.put("П", "та-пиии-пиии-та ");
        alph.put("Р", "та-пиии-та ");
        alph.put("С", "та-та-та ");
        alph.put("Т", "пиии ");
        alph.put("У", "та-та-пиии ");
        alph.put("Ф", "та-та-пиии-та ");
        alph.put("Х", "та-та-та-та ");
        alph.put("Ц", "пиии-та-пиии-та ");
        alph.put("Ч", "пиии-пиии-пиии-та ");
        alph.put("Ш", "пиии-пиии-пиии-пиии ");
        alph.put("Щ", "пиии-пиии-та-пиии ");
        alph.put("Ь", "пиии-та-та-пиии ");
        alph.put("Ъ", "пиии-та-пиии-пиии ");
        alph.put("Э", "та-та-пиии-та-та ");
        alph.put("Ю", "та-та-пиии-пиии ");
        alph.put("Я", "та-пиии-та-пиии ");

        alph.put("1", "та-пиии-пиии-пиии-пиии ");
        alph.put("2", "та-та-пиии-пиии-пиии ");
        alph.put("3", "та-та-та-пиии-пиии ");
        alph.put("4", "та-та-та-та-пиии ");
        alph.put("5", "та-та-та-та-та ");
        alph.put("6", "пиии-та-та-та-та ");
        alph.put("7", "пиии-пиии-та-та-та ");
        alph.put("8", "пиии-пиии-пиии-та-та ");
        alph.put("9", "пиии-пиии-пиии-пиии-та ");
        alph.put("0", "пиии-пиии-пиии-пиии-пиии ");

        alph.put(".", "та-та-та-та-та-та ");
        alph.put(",", "та-пиии-та-пиии-та-пиии ");
        alph.put(" ", " ");
        alph.put(";", "пиии-та-пиии-та-пиии-та ");
        alph.put(":", "пиии-пиии-пиии-та-та-та ");
        alph.put("?", "та-та-пиии-пиии-та-та ");
        alph.put("!", "пиии-пиии-та-та-пиии-пиии ");
        alph.put("-", "пиии-та-та-та-та-пиии ");
        alph.put("QUOTATION", "та-пиии-та-та-пиии-та ");
        alph.put("(", "пиии-та-пиии-пиии-та-пиии ");
        alph.put("/", "пиии-та-та-пиии-та ");

    }

    public static void biper(String symbol) {
        System.out.print(alph.get(symbol));
    }
}
