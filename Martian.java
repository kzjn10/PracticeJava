/**
 * Define an array to be a Martian array if the number of 1s is greater than the number of 2s and no two adjacent elements are equal.
 *
 * Write a function named isMartian that returns 1 if its argument is a Martian array; otherwise it returns 0.
 *
 * If you are programming in Java or C#, the function signature is
 * int isMartian(int[ ] a)
 *
 * There are two additional requirements.
 *
 * 1. You should return 0 as soon as it is known that the array is not a Martian array; continuing to analyze the array would be a waste of
 * CPU cycles.
 * 2. There should be exactly one loop in your solution.
 *
 * Examples
 * 
 * a is						    then function returns		reason
 * {1, 3} 						1 							There is one 1 and zero 2s, hence the number of 1s is greater than the number of 2s. Also, no adjacent elements have the same value (1 does not equal 3)
 * {1, 2, 1, 2, 1, 2, 1, 2, 1} 	1 							There are five 1s and four 2s, hence the number of 1s is greater than the number of 2s. Also, no two adjacent elements have the same value.
 * {1, 3, 2} 					0 							There is one 1 and one 2, hence the number of 1s is not greater than the number of 2s.
 * {1, 3, 2, 2, 1, 5, 1, 5} 	0 							There are two 2s adjacent to each other.
 * {1, 2, -18, -18, 1, 2} 		0 							The two -18s are adjacent to one another. Note that the number of 1s is not greater than than the number of 2s but your method should return 0 before determining that! (See the additional requirements above.)
 */

public class Martian {

    public static int isMartian(int[] a) {
        // Check array is null or empty
        if (a == null || a.length == 0) {
            return 0;
        }

        // If array has one child then check 1s greater than 2s
        if (a.length == 1) {
            return a[0] == 1 ? 1 : 0;
        }

        // Temp variable to count 1s and 2s
        int oneCounter = 0;
        int twoCounter = 0;

        // Loop
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                oneCounter++;
            } else if (a[i] == 2) {
                twoCounter++;
            } else {
                // Hanlde if not 1 or 2 number
                if (i < a.length - 1 && a[i] == a[i + 1]) {
                    return 0;
                }
            }
        }

        return oneCounter > twoCounter ? 1 : 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isMartian(new int[] { 1, 3 })); // should return 1
        System.out.println(isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 })); // should return 1
        System.out.println(isMartian(new int[] { 1, 3, 2 })); // should return 0
        System.out.println(isMartian(new int[] { 1, 3, 3, 2, 1 })); // should return 0
        System.out.println(isMartian(new int[] { 1, 2, -18, -18, 1, 2 })); // should return 0
        System.out.println(isMartian(new int[] {})); // should return 0
        System.out.println(isMartian(new int[] { 1 })); // should return 1
        System.out.println(isMartian(new int[] { 2 })); // should return 0
    }
}
