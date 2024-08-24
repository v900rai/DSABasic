package AdvancedDataStructureInJava;

public class knapSackInJava {

        // Function to return the maximum value that can be put in a knapsack of capacity W.
        static int knapSack(int W, int wt[], int val[]) {
            int n = val.length; // Number of items
            int[][] dp = new int[n + 1][W + 1]; // DP table

            // Build the DP table in bottom-up manner
            for (int i = 0; i <= n; i++) {
                for (int w = 0; w <= W; w++) {
                    if (i == 0 || w == 0) {
                        dp[i][w] = 0; // Base case: no items or zero capacity
                    } else if (wt[i - 1] <= w) {
                        // Option 1: Include the item and add its value
                        // Option 2: Exclude the item
                        dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                    } else {
                        // Cannot include the item
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }

            return dp[n][W]; // Maximum value for the full problem
        }

        public static void main(String[] args) {
            int W = 50; // Knapsack capacity
            int[] wt = {10, 20, 30}; // Weights of items
            int[] val = {60, 100, 120}; // Values of items

            int result = knapSack(W, wt, val);
            System.out.println("Maximum value in knapsack: " + result);
        }
    }


