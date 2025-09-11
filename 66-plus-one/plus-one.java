import java.util.Arrays;
  //  solution
public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    // Optional: You can have a main method for local testing.
    public static void main(String[] args) {
        int[] digits = {1, 9};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
}
