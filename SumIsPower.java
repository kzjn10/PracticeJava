public class SumIsPower {
    public static int sumIsPower(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        int step = 0;
        int temp = 0;
        while (temp < sum) {
            temp = (int) Math.pow(2, step);
            step++;
            if (temp == sum) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumIsPower(new int[] { 1, 3 })); // should return 1
        System.out.println(sumIsPower(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 })); // should return 1
        System.out.println(sumIsPower(new int[] { 1, 3, 2 })); // should return 0
        System.out.println(sumIsPower(new int[] { 1, 3, 3, 2, 1 })); // should return 0
        System.out.println(sumIsPower(new int[] {})); // should return 0
        System.out.println(sumIsPower(new int[] { 1 })); // should return 1
        System.out.println(sumIsPower(new int[] { 2 })); // should return 0

    }
}
