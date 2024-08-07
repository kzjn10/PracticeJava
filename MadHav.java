// A Madhav array has the following property. a[0]=a[1]+a[2]=a[3]+a[4]+a[5]=a[6]+a[7]+a[8]+a[9]=...
// The length of a Madhav array must be n*(n+1)/2 for some n.
// Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,otherwise it returns 0. If you are programming in Java or C# the function signature is
// int isMadhavArray(int[ ] a)
// If you are programming in C or C++, the function signature is
// int isMadhavArray(int a[ ], int len) where len is the number of elements in a.

public class MadHav {
    private static boolean isValid(int size) {
        int i = 1;
        int temp = 0;
        while (temp < size) {
            temp = (i * (i + 1)) / 2;
            if (temp == size) {
                return true;
            } else if (temp > size) {
                return false;
            }

            i++;
        }

        return false;
    }

    private static int isMadhavArray(int[] input) {
        // Check is valid size n(n+1)/2
        if (!isValid(input.length)) {
            return 0;
        }

        // Atleast size = 3
        if (input.length < 3) {
            return 0;
        }

        int step = 1;
        int startIndex = step;
        int endIndex = step + 1;
        int sum = 0;
        while (startIndex <= endIndex && startIndex < input.length && endIndex < input.length) {
            sum += input[startIndex];

            // Check if is start equal to end then update variables to process next step
            if (startIndex == endIndex) {
                // Check sum more than input[0]
                if (sum > input[0]) {
                    return 0;
                }

                // Next step
                step++;
                startIndex = endIndex + 1;
                endIndex = startIndex + step;
                sum = 0;
            } else {
                startIndex++;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] a0 = { 2, 1, 1 };
        int[] a1 = { 2, 1, 1, 4, -1, -1 };
        int[] a2 = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
        int[] a3 = { 18, 9, 10, 6, 6, 6 };
        int[] a4 = { -6, -3, -3, 8, -5, -4 };
        int[] a5 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
        int[] a6 = { 3, 1, 2, 3, 0 };

        System.out.println("Is Madhav: " + isMadhavArray(a0));
        System.out.println("Is Madhav: " + isMadhavArray(a1));
        System.out.println("Is Madhav: " + isMadhavArray(a2));
        System.out.println("Is Madhav: " + isMadhavArray(a3));
        System.out.println("Is Madhav: " + isMadhavArray(a4));
        System.out.println("Is Madhav: " + isMadhavArray(a5));
        System.out.println("Is Madhav: " + isMadhavArray(a6));
    }
}
