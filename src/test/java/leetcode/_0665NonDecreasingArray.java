package leetcode;

/**
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * Note: The n belongs to [1, 10,000].
 */
public class _0665NonDecreasingArray {
  public static boolean checkPossibility(int[] nums) {
    int max = 0;
    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      max = Math.max(max, nums[i]);
      if (nums[i] > nums[i + 1]) {
        int left = nums[i];
        int right = nums[i + 1];
        nums[i + 1] = left;
        boolean changeright = true;
        boolean changeleft = true;
        for (int r = i; r < len - 1; r++) {
          if (nums[r] > nums[r + 1]) {
            nums[i + 1] = right;
            changeright = false;
          }
        }
        nums[i] = right;
        for (int l = 0; l < len - 1; l++) {
          if (nums[l] > nums[l + 1]) {
            nums[i] = left;
            changeleft = false;
          }
        }
        nums[i] = left;
        nums[i + 1] = right;
        return changeright || changeleft;
      }
    }
    return true;
  }
}
