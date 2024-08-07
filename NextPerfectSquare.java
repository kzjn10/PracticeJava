public class NextPerfectSquare {

    private static int nextPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int i = 1;
        while (i * i <= n) {
            i++;
        }

        return i * i;
    }

    public static void main(String[] args) {
        System.out.println("Next perfect square is: " + nextPerfectSquare(6));
        System.out.println("Next perfect square is: " + nextPerfectSquare(36));
        System.out.println("Next perfect square is: " + nextPerfectSquare(0));
        System.out.println("Next perfect square is: " + nextPerfectSquare(-5));
    }

}
