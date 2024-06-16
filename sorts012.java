package selfpractices.InterviewOnly;

public class sorts012 {

        public static void sort012(int a[], int n) {
            int zero = 0;
            int one = 0;
            int two = 0;

            // Count the number of 0s, 1s and 2s
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) zero++;
                else if (a[i] == 1) one++;
                else if (a[i] == 2) two++;
            }

            // Fill the array with 0s, 1s and 2s
            int i = 0;
            while (zero > 0) {
                a[i++] = 0;
                zero--;
            }
            while (one > 0) {
                a[i++] = 1;
                one--;
            }
            while (two > 0) {
                a[i++] = 2;
                two--;
            }
        }

        public static void main(String[] args) {
            int[] arr = {2, 0, 2, 1, 1, 0};
            int n = arr.length;
            sort012(arr, n);
            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


