import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyRecursive {

    private HashMap<String, Integer> h = new HashMap<String, Integer>();

    public void frequencies(List<String> input) {
        frequenciesHelper(input, new HashMap<>());
    }

    private void frequenciesHelper(List<String> input, HashMap<String, Integer> h) {
        if (input.isEmpty()) {
            this.h = h;
            return;
        }

        String firstElement = input.get(0);
        // Integer count = h.get(firstElement);

        h.put(firstElement, h.getOrDefault(firstElement, 0) + 1);

        // if (count != null) {
        //     h.put(firstElement, count + 1);
        // } else {
        //     h.put(firstElement, 1);
        // }

        List<String> remainingElements = input.subList(1, input.size());
        frequenciesHelper(remainingElements, h);
    }

    // Expected output: {feather=2, Tom=3, cat=2, rich=1, dog=2, bull=1}
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
                add("Tom");
                add("cat");
                add("Tom");
                add("dog");
                add("cat");
                add("Tom");
                add("feather");
                add("dog");
                add("bull");
                add("rich");
                add("feather");
            }
        };

        FrequencyRecursive p = new FrequencyRecursive();
        p.frequencies(list);
        System.out.println(p.h);
    }
}
