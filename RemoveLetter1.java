
public class RemoveLetter1 {
    public static String removeLetter(String word, char letter) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != letter) {
                temp.append(word.charAt(i));
            }
        }

        return temp.toString();
    }

    public static String[] processList(String[] input, char letter) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = removeLetter(input[i], letter);
        }

        return result;
    }

    public static void main(String[] args) {

        String[] arr = new String[] { "apple", "banana", "avocado", "grape" };

        String[] result = processList(arr, 'a');
        for (String item : result) {
            System.out.println(item);
        }
    }
}
