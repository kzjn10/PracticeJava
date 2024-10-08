import java.util.HashMap;

public class SumOf {
    // Write a method named “sumOf”, that receives an array of integers and an
    // integer target, return indices of the two numbers such that they add up to
    // target.
    // You may assume that each input would have exactly one solution, and you may
    // not use the same element twice.
    // public static void sumOf(int[] arr, int target) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length - 1; j++) {
    // if (arr[i] + arr[j] == target) {
    // System.out.println(i + ", " + j);
    // return;
    // }
    // }
    // }

    // System.out.println("Not found");
    // }

    public static void sumOf(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println(map.get(arr[i]) + ", " + i);
                return;
            } else {
                // Store value and index
                map.put(target - arr[i], i);
            }
        }

        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] input = new int[] { 3, 1, 5, 8, 9 };

        sumOf(input, 13);
        sumOf(input, 16);
        sumOf(input, 18);

    }
}
