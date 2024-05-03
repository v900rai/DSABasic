package selfpractices;

public class twoSumqultarget {
    public static String twoSum(int arr[], int n, int target){
        for(int i=0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return "YES";


            }
        }
            return "NO";
        }


    public static void main(String[] args) {
        int n=5;
        int arr[]={10,2,3,1,5};
       int  target=6;
      String  result= twoSum(arr, n,target);
        System.out.println(result);

    }
}
