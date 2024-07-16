public class OddHeavy {
    public static int isOddHeavy(int[] a) {
        // Return false if empty
        if (a.length == 0) {
            return 0;
        }

        // Only one item
        if (a.length == 1) {
            return a[0] % 2 == 0 ? 0 : 1;
        }

        // Check loop
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { // if has event number
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 != 0 && a[j] < a[i]) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 8 })); // 1
        System.out.println(isOddHeavy(new int[] { 11, 4, 9, 2, 3, 10 })); // 0
        System.out.println(isOddHeavy(new int[] { 1 }));// 1
        System.out.println(isOddHeavy(new int[] { 2 }));// 0
        System.out.println(isOddHeavy(new int[] { 2, 4, 6, 8, 11 }));// 1
        System.out.println(isOddHeavy(new int[] { -2, -4, -6, -8, -11 }));// 0
    }
}
