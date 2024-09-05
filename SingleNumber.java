public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }

    /**
     * XOR operator is used to check same number as it uses its binary to check the numbers
     * it returns 0 for same and 1 for different
     * 0001
     * ^1000
     * 1001 --> 9
     */
    private static int singleNumber(int[] arr) {
        int i = 0;
        for (int num : arr) {
            i ^= num;
        }
        return i;
    }
}
