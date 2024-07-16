public class SingleMaximum {

    public static int hasSingleMaximum(int[] a) {

        // Check array is null or empty
        if (a == null | a.length == 0) {
            return 0;
        }

        // If has one item return to save the CPU cycles
        if (a.length == 1) {
            return 1;
        }

        // Assign the value for temp variable
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            } else if (a[i] == maxValue) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSingleMaximum(new int[] { 1, 2, 3, 1, 0 })); // should return 1
        System.out.println(hasSingleMaximum(new int[] { 18 })); // should return 1
        System.out.println(hasSingleMaximum(new int[] { 1, 2, 3, 0, 1, 3 })); // should return 0
        System.out.println(hasSingleMaximum(new int[] { 13, 1, 13, 2, 13, 0, 13, 1, 13 })); // should return 0
        System.out.println(hasSingleMaximum(new int[] {})); // should return 0
        System.out.println(hasSingleMaximum(new int[] { -6, -6, -6, -6, -6, -6, -6 }));// should return 0
    }
}
