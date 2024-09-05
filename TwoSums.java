import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TwoSums {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3};
        int target = 6;
        int[] twoSum = getTwoSum1(arr, target);
        for (int i : twoSum) {
            System.out.println(i);
        }
        check();
    }

    private static int[] getTwoSum(int[] nums, int target) {
        Set<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Set<int[]> nums1 = Set.of(nums);
        int[] array = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }

    private static int[] getTwoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException();
    }

    private static void check() {
        Map<String, Double> map = new TreeMap<>();
        map.put("1", 20.6);
        map.put("1", map.getOrDefault("1", 10.4));

        System.out.println(map.get("1"));
    }
}
