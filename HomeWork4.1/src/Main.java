import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = new String("I like study Basic Java!");
        char preLastChar = str.charAt(str.length() -2);
        System.out.println("Предпоследний символ строки: " + preLastChar);
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);
        // String withoutJava = str.substring(0, str.indexOf("Java")) = str.substring(str.indexOf("Java") + 4);
        // System.out.println("Строка без 'Java': " + withoutJava);
        String replacedString = str.replace('a', 'o');
        System.out.println("Строка после замены 'а' на 'о':" + replacedString)
        ;
        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);
        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

    }
}