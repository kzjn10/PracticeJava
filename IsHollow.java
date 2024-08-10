public class IsHollow {
    public static boolean isHollow(int a[]) {
        int middleIndex = a.length / 2;
        // Check length and middle item condition
        if (a.length < 3 || a[middleIndex] != 0) {
            return false;
        }

        // Count zero at the middle
        int zeroCounter = 1;
        int startIndexFromMiddle = middleIndex - 1;
        int endIndexFromMiddle = middleIndex + 1;

        while (true) {
            if (startIndexFromMiddle >= 0 && a[startIndexFromMiddle] == 0) {
                startIndexFromMiddle--;
                zeroCounter++;
            }

            if (endIndexFromMiddle <= a.length && a[endIndexFromMiddle] == 0) {
                endIndexFromMiddle++;
                zeroCounter++;
            }

            // All zero at middle not inline
            if (((startIndexFromMiddle + endIndexFromMiddle) / 2) != middleIndex) {
                return false;
            }

            if (startIndexFromMiddle < 0
                    || endIndexFromMiddle > a.length
                    || a[startIndexFromMiddle] != 0
                    || a[endIndexFromMiddle] != 0) {
                break;
            }
        }

        if (zeroCounter < 3) {
            return false;
        }

        // Check the number of preceding non-zeros is not equal to the number of
        // following non-zeros
        if (startIndexFromMiddle != (a.length - 1 - endIndexFromMiddle)) {
            return false;
        }

        while (startIndexFromMiddle >= 0 && endIndexFromMiddle <= a.length) {
            // Check all zero at the middle
            if (a[startIndexFromMiddle] == 0 || a[startIndexFromMiddle] == 0) {
                return false;
            }

            startIndexFromMiddle--;
            endIndexFromMiddle++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Hollow: " + isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 })); // yes | 2 non-zeros precede and follow 3 zeros in the middle
        System.out.println("Is Hollow: " + isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 })); // yes | 4 non-zeros precede and follow the 5 zeros in the middle
        System.out.println("Is Hollow: " + isHollow(new int[] { 1, 2, 0, 0, 3, 4 })); // no | There are only 2 zeroes in the middle; at least 3 are required
        System.out.println("Is Hollow: " + isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 })); // no | The number of preceding non-zeros(2) is not equal to the number of following non-zeros(3)
        System.out.println("Is Hollow: " + isHollow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 })); // no | The number of preceding non-zeros(3) is not equal to the number of following non-zeros(2)
        System.out.println("Is Hollow: " + isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 })); // no | Not all zeros are in the middle
        System.out.println("Is Hollow: " + isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 })); // no | Not all zeros are in the middle
        System.out.println("Is Hollow: " + isHollow(new int[] { 0, 0, 0 })); // yes | The number of preceding non-zeros is 0 which equals the number of following non-zeros. And there are three zeros "in the middle".
    }

}
