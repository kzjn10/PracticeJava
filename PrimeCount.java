/// Ref: https://www.geeksforgeeks.org/prime-numbers/

public class PrimeCount {

    // private static boolean isPrime(int n) {
    // if (n < 2) {
    // return false;
    // }

    // if (n <= 3) {
    // return true;
    // }

    // if (n % 2 == 0 || n % 3 == 0) {
    // return false;
    // }

    // int i = 2;
    // while (i < n) {
    // if (n % i == 0) {
    // return false;
    // }
    // i++;
    // }

    // return true;
    // }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int primeCount(int start, int end) {
        int count = 0;
        start = start < 0 ? 1 : start;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Prime count: " + primeCount(10, 30));
        System.out.println("Prime count: " + primeCount(11, 29));
        System.out.println("Prime count: " + primeCount(20, 22));
        System.out.println("Prime count: " + primeCount(1, 1));
        System.out.println("Prime count: " + primeCount(5, 5));
        System.out.println("Prime count: " + primeCount(6, 2));
        System.out.println("Prime count: " + primeCount(-10, 6));
    }

}
