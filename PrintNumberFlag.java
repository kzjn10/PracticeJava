public class PrintNumberFlag {
    public static void printNumberFlag(int n) {
        int counter1 = 1;
        int counter2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " ");
            if (counter1 == counter2) {
                System.out.println(" ");
                counter1++;
                counter2 = 1;
            } else {
                counter2++;
            }
        }
    }

    public static void printNumberFlag1(int n) {
        // Check deep of flag
        if (n < 1) {
            return;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + "");
            }

            System.out.println(" ");
        }
    }

    public static void printNumberFlag2(int n) {
        // Check deep of flag
        if (n < 1) {
            return;
        }

        int counter1 = 1;
        int counter2 = 1;
        for (int i = 0; i <n; i++) {
            System.out.print((i + 1) + "");
            if (counter1 == counter2) {
                System.out.println(" ");
                counter1++;
                counter2 = 0;
            } else {
                counter2++;
            }

        }
    }

    public static void main(String[] args) {
        printNumberFlag(7);
        printNumberFlag1(7);
        printNumberFlag2(7);
    }
}
