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

    public static void main(String[] args) {
        System.out.println("reserveNumber: " + reserveNumber(100));
        System.out.println("reserveNumber: " + reserveNumber(123));
        System.out.println("reserveNumber: " + reserveNumber(1212));
        System.out.println("reserveNumber: " + reserveNumber(9981));
    }
}
