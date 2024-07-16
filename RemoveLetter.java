import java.util.ArrayList;

public class RemoveLetter {
    public static String removeLetter(String word, char letter) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != letter) {
                temp.append(word.charAt(i));
            }
        }

        return temp.toString();
    }

    public static ArrayList<String> processList(ArrayList<String> input, char letter) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : input) {
            result.add(removeLetter(item, letter));
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("avocado");
        input.add("grape");
        
        ArrayList<String> result = processList(input, 'a');
        for (String item : result) {
            System.out.println(item);
        }
    }
}
