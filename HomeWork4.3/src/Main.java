import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Добрый день, " + name + "!");
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() -1);
        System.out.println("Ваше имя начинается с символа <" + firstChar + "> и заканчивается на символ <" + lastChar + ">");
    }
}
//


