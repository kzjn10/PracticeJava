public class CountDigit {

    public static int countDigit(int n, int seed) {
        int counter = 0;
        if (n < 0) {
            return -1;
        }

        while (n > 0) {
            if (n % 10 == seed) {
                counter++;
            }
            n = n / 10;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(101010100, 0));
    }
}
