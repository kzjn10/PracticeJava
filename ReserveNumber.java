public class ReserveNumber {

    public static int reserveNumber(int n) {
        int res = 0;
        if (n < 10) {
            return n;
        }

        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            res = res * 10 + temp;
        }

        return res;
    }

    public static int reserveNumberRecursive(int n) {
        int lastDigit = n % 10;
        int remainingDigit = n / 10;
        if (remainingDigit == 0) {
            return n;
        } else {
            return lastDigit
                    * (int) Math.pow(10, String.valueOf(remainingDigit).length())
                    + reserveNumberRecursive(remainingDigit);
        }
    }

    public static int reserveNumberRecursive1(int n, int res) {
        if (n == 0) {
            return res;
        }

        int remainingDigit = n % 10;
        int remaining = n / 10;

        res = res * 10 + remainingDigit;
        return reserveNumberRecursive1(remaining, res);

    }

    public static void main(String[] args) {
        // System.out.println("reserveNumber: " + reserveNumber(100));
        // System.out.println("reserveNumber: " + reserveNumber(123));
        // System.out.println("reserveNumber: " + reserveNumber(1212));
        // System.out.println("reserveNumber: " + reserveNumber(9981));

        // System.out.println("reserveNumber: " + reserveNumberRecursive(100));
        // System.out.println("reserveNumber: " + reserveNumberRecursive(123));
        // System.out.println("reserveNumber: " + reserveNumberRecursive(1212));
        // System.out.println("reserveNumber: " + reserveNumberRecursive(9981));

        int temp = 0;
        System.out.println("reserveNumber: " + reserveNumberRecursive1(100, temp));
        temp = 0;
        System.out.println("reserveNumber: " + reserveNumberRecursive1(123, temp));
        temp = 0;
        System.out.println("reserveNumber: " + reserveNumberRecursive1(1212, temp));
        temp = 0;
        System.out.println("reserveNumber: " + reserveNumberRecursive1(9981, temp));
    }
}
