/**
 * * Write a function named minDistance that returns the smallest distance between two factors of a number.
 * *
 * * For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
 * * minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
 * *
 * * As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
 * * and the smallest distance between any two factors is 1 (2 – 1 = 1).
 * *
 * * The function signature is
 * * int minDistance(int n)
 */

public class MinDistance {

    public static int minDistance(int n) {
        if (n <= 1) {
            return -1;
        }

        int factor1 = 1;
        int factor2 = 0;
        int minDistance = n; // Assign min distance is n
        for (int i = 2; i < n; i++) {
            // Check i is factor of n
            if (n % i == 0) { 
                factor2 = i;
                int distance = factor2 - factor1;
                // Check and assign new value if less than
                if (distance < minDistance) {
                    factor1 = factor2;
                    minDistance = distance;
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minDistance(7));
        System.out.println(minDistance(25));
        System.out.println(minDistance(8));
        System.out.println(minDistance(13));
        System.out.println(minDistance(22));
        System.out.println(minDistance(13013));
    }
}
