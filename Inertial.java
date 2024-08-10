public class Inertial {

    private static int isIntertial(int[] a) {
        // If array only one item then only one odd or event not match condition
        if (a.length == 1) {
            return 0;
        }

        boolean hasOddValue = false;
        int maxValue = a[0];
        int minOddValue = -1;//Integer.MIN_VALUE
        for (int i = 0; i < a.length; i++) {
            // Find max value of array
            if (maxValue < a[i]) {
                maxValue = a[i];
            }

            // Find min odd value and check has odd value
            if (a[i] % 2 != 0) {
                hasOddValue = true;
                if ((minOddValue == -1 || minOddValue > a[i])) {
                    minOddValue = a[i];
                }
            }
        }

        // Check condition
        if (!hasOddValue || maxValue % 2 != 0 || minOddValue > maxValue) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] != maxValue && a[i] > minOddValue) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println("isInertial: " + isIntertial(new int[] { 11, 4, 20, 9, 2, 8 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 12, 11, 4, 9, 2, 3, 10 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 1 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 2 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 1, 2, 3, 4 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 1, 1, 1, 1, 1, 1, 2 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 2, 12, 4, 6, 8, 11 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 2, 12, 12, 4, 6, 8, 11 }));
        System.out.println("isInertial: " + isIntertial(new int[] { -2, -4, -6, -8, -11 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 2, 3, 5, 7 }));
        System.out.println("isInertial: " + isIntertial(new int[] { 2, 4, 6, 8, 10 }));
    }
}
