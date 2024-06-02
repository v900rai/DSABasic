package selfpractices;

public class MinMaxFinder {

        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

            // Assuming the array is not empty
            int minValue = numbers[0];
            int maxValue = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                }
            }

            System.out.println("Minimum value: " + minValue);
            System.out.println("Maximum value: " + maxValue);
        }
    }


