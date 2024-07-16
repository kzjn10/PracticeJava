import java.util.LinkedList;

public class RemoveDuplicationsRecursive {
    static LinkedList<String> removeDuplications(LinkedList<String> list) {

        // Exception condition
        if (list == null) {
            return new LinkedList<>(); // Return empty or throw exception depend on requirment
        }

        // Stop condition
        if (list.size() < 2) {
            return list;
        }

        // Loop condition
        LinkedList<String> result = new LinkedList<>();
        String lastItem = list.removeLast();
        if (!list.isEmpty()) {
            result.addAll(removeDuplications(list));
        }

        // Add item to result
        if (!result.contains(lastItem)) {
            result.add(lastItem);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("3");

        LinkedList<String> result = removeDuplications(list);
        System.out.print("Result: " + result.toString());
    }
}
