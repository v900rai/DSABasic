package selfpractices;

public class RotateArray {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            rotate(nums, k);

            // Print rotated array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // Handle cases where k is greater than the length of the array

            // Reverse the entire array
            reverse(nums, 0, n - 1);
            // Reverse the first k elements
            reverse(nums, 0, k - 1);
            // Reverse the remaining elements
            reverse(nums, k, n - 1);
        }

        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }


