// A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. For example 24 is digit-increasing because it equals 2 + 22 (here n = 2)
// Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it returns 0.
// The signature of the method is 
// int isDigitIncreasing(int n)

public class DigitIncreasing {

    static int isDigitIncreasing(int n) {
        // If less than 0 o more than 1111111101
        if (n <= 0 || n > 1111111101) {
            return 0;
        }

        // Loop
        for (int i = 1; i <= 9; i++) {
            int sum = 0; // Sum value
            int temp = 0; // 1 11 111 1111 ... 111111111
            while (sum < n) {
                temp = temp * 10 + i;
                sum += temp;
                // Check sum equal to n
                if (sum == n) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isDigitIncreasing(7)); // should return 1
        System.out.println(isDigitIncreasing(36)); // should return 1
        System.out.println(isDigitIncreasing(984)); // should return 1
        System.out.println(isDigitIncreasing(7404)); // should return 1
        System.out.println(isDigitIncreasing(37)); // should return 0
    }
}
