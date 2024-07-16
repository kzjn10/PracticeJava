import java.util.ArrayList;

public class RemoveLetter2 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("avocado");
        input.add("grape");

        input.stream().forEach(s -> System.out.println(s.replace("a", "")));
    }
}
