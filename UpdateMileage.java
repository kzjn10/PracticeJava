public class UpdateMileage {
    private static boolean isValid(int[] a, int miles) {
        int index = a.length - 1;
        long number = 0;
        while (index >= 0) {
            number += a[index] * Math.pow(10, index);
            index--;
        }

        try {
            long currentMiles = number + miles;
            if (currentMiles > 10000000000L) {
                return false;
                
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private static void updateMileageCounter(int[] a, int miles) {
        if (a.length == 0 || miles < 1 || !isValid(a, miles)) {
            return;
        }

        int index = 0;
        while (index < a.length) {
            int temp = a[index] + (index == 0 ? miles : 1);
            if (temp < 10) {
                a[index] = temp;
                break;
            } else {
                a[index] = temp % 10;
                index++;
            }
        }
    }

    private static void updateMileageCounter1(int[] a, int miles) {
        try {
            StringBuilder builder = new StringBuilder();
            int index = a.length;

            while (index > 0) {
                builder.append(a[index - 1]);
                index--;
            }

            int totalMiles = Integer.valueOf(builder.toString()) + miles;
            String totalMilesString = String.valueOf(totalMiles);
            for (int i = 0; i < totalMilesString.length(); i++) {
                if (i > 9) {
                    break;
                }

                a[i] = Integer.valueOf(String.valueOf(totalMilesString.charAt(i)));
            }
        } catch (Exception e) {
            System.out.println(">>> Invalid input");
        }
    }

    public static void main(String[] a) {
        int[] input1 = new int[] { 8, 9, 9, 5, 0 };
        updateMileageCounter(input1, 1);
        for (int i : input1) {
        System.out.print(i + ", ");
        }
        System.out.println();

        int[] input2 = new int[] { 8, 9, 9, 5, 0 };
        updateMileageCounter(input2, 2);
        for (int i : input2) {
        System.out.print(i + ", ");
        }
        System.out.println();

        int[] input3 = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        updateMileageCounter(input3, 1);
        for (int i : input3) {
        System.out.print(i + ", ");
        }
        System.out.println();

        int[] input4 = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        updateMileageCounter(input4, 13);
        for (int i : input4) {
        System.out.print(i + ", ");
        }
        System.out.println();

        // -----------------------------

        // int[] input1 = new int[] { 8, 9, 9, 5, 0 };
        // updateMileageCounter1(input1, 1);
        // for (int i : input1) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();

        // int[] input2 = new int[] { 8, 9, 9, 5, 0 };
        // updateMileageCounter1(input2, 2);
        // for (int i : input2) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();

        // int[] input3 = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        // updateMileageCounter1(input3, 1);
        // for (int i : input3) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();

        // int[] input4 = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        // updateMileageCounter1(input4, 13);
        // for (int i : input4) {
        //     System.out.print(i + ", ");
        // }
        // System.out.println();
    }
}
