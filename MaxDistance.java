package selfpractices;

public class MaxDistance {
    public  static int maxDistance(int arr[], int n){
        int maxD=-1;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; i<n; j++){
                if(arr[i]==arr[j]){
                    int temp = Math.abs(j - i);
                    maxD = Math.max(maxD, temp);
                }
            }
        }
        return maxD;

    }

    public static void main(String[] args) {
        int[] Arr = { 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 };
        System.out.printf(
                "Maximum distance between two occurrences of same element in array:%d",
                maxDistance(Arr, 10));
    }
}
