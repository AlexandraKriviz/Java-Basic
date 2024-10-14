public class Check {
    public static boolean temperature(int temperature1, int temperature2) {
        return temperature1>100 && temperature2<100;
    }

    public static void main(String[] args) {
        int temperature1 = 10;
        int temperature2 = 90;
        boolean result = temperature(temperature1,
                temperature2);
        System.out.println("Does device working correct? " + result);
    }
}
