public class BankAccount {
    public static int getMaxDivisor (int n) {
        for (int i = n-1; i>0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static int countDays(int n) {
        int days = 0;
        while (n>1) {
            int maxDivisor = getMaxDivisor(n);
            n -= maxDivisor;
            days++;
        }
        days++;
        return days;
    }

    public static void main(String[] args) {
        int N = 21;
        int days = countDays(N);
        System.out.println("The number of days is: " + days);
    }
}
