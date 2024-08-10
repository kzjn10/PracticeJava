public class ConsecutiveFactored {

    private static int isConsectiveFactored(int n) {
        if (n < 2) {
            return 0;
        }

        int lastFactor = -1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (lastFactor != -1 && lastFactor + 1 == i) {
                    return 1;
                }

                lastFactor = i;

            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Consecutive factored: " + isConsectiveFactored(24)); // 1 | 24 = 2*3*4 and 3 = 2 + 1
        System.out.println("Consecutive factored: " + isConsectiveFactored(105)); // 0 | 105 = 3*5*7 and 5 != 3+1 and 7
                                                                                  // != 5+1
        System.out.println("Consecutive factored: " + isConsectiveFactored(90)); // 1 | factors of 90 include 2 and 3
                                                                                 // and 3 = 2 + 1
        System.out.println("Consecutive factored: " + isConsectiveFactored(23)); // 0 | has only 1 factor that is not
                                                                                 // equal to 1
        System.out.println("Consecutive factored: " + isConsectiveFactored(15));
        System.out.println("Consecutive factored: " + isConsectiveFactored(2));
        System.out.println("Consecutive factored: " + isConsectiveFactored(0));
        System.out.println("Consecutive factored: " + isConsectiveFactored(-12));

    }
}
