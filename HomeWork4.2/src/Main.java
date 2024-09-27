public class Main {
   // public static void main(String[] args) {
        // public static int add(int a, intb); {
           // return a + b;}
       // public static int subtract(int a, intb) {
            //return a - b;}
       // public static int multiplay(int a, intb) {
            //return a * b;}
       // public static double divide(int a, intb) {
            //if (b != 0) {
                //return (double) a / b;
            //} else {
               // System.out.println("Ошибка: Деление на ноль.");
               // return 0;
            //}
        //}

        public static void main(String[] args) {

            int num1 = 10;
            int num2 = 5;

            System.out.println("Сложение:" + add(num1, num2));
            System.out.println("Вычитание:" + subtract(num1, num2));
            System.out.println("Умножение:" + multiplay(num1, num2));
            System.out.println("Деление:" + divide(num1, num2));
        }

