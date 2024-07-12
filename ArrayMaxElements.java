import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayMaxElements {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 6, 2, 2, 4, 4, 4};

        System.out.println("maxNumberByHalfArrayLength " + maxNumberByHalfArrayLength(arr));
        System.out.println("maxElement " + maxElement(arr));

    }

    private static int maxNumberByHalfArrayLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() >= arr.length / 2) {
                count = m.getKey();
                break;
            }
        }
        return count;
    }

    private static int maxElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int count = 0;
        int maxElement = arr[0];
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > count) {
                count = m.getValue();
                maxElement = m.getKey();
            }
        }
        return maxElement;
    }

    private static int maxElementUsingStreams(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
    }
}
