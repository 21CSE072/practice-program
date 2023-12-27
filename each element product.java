import java.util.Arrays;
public class Main{
    public static int[] getProductArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];
        prefixProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        }
        suffixProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i + 1] * nums[i + 1];
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }
    return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = getProductArrayExceptSelf(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
    }
}