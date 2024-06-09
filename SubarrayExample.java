package selfpractices.InterviewOnly;


import java.util.Arrays;

public class SubarrayExample {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};

            // Print all subarrays
            for (int start = 0; start < arr.length; start++) {
                for (int end = start; end < arr.length; end++) {
                    // Print subarray from index start to end
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
                }
            }
        }
    }


