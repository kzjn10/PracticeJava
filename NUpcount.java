public class NUpcount {
    private static int nUpcount(int a[], int n) {
        int count = 0;
        int sum = 0;
        boolean isUp = false;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > n) {
                if (isUp) {
                    continue;
                }
                count++;
                isUp = true;
            } else {
                isUp = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("NUpcount time: " + nUpcount(new int[] { 2, 3, 1, -6, 8, -3, -1, 2 }, 5));
        System.out.println("NUpcount time: " + nUpcount(new int[] { 6, 3, 1 }, 1));
    }
}
