import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NTimeOccurences {


    public int[] deleteNth(int[] elements, int maxOccurrences) {

        if (maxOccurrences < 1) return new int[0];

        final HashMap<Integer, Integer> mapRepeated = new HashMap<>();
        final List<Integer> elementsList = new ArrayList<>();

        for (final Integer element : elements) {
            final Integer repetition = mapRepeated.put(element, mapRepeated.getOrDefault(element, 0) + 1);

            if (repetition == null || repetition < maxOccurrences) elementsList.add(element);
        }
        return elementsList.stream().mapToInt(i -> i).toArray();
    }
}
