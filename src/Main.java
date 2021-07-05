import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] elements = {1, 1, 2, 1, 5, 6, 4, 2, 5, 4, 2, 1, 3, 3, 1, 3, 1, 5, 4, 2, 5, 6, 6};
        NTimeOccurences nTimeOccurences = new NTimeOccurences();

        int[] result = nTimeOccurences.deleteNth(elements, 2);

        System.out.println(Arrays.toString(result));

    }
}
