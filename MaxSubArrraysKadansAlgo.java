package AdvancedDataStructureInJava;

public class MaxSubArrraysKadansAlgo {
    public static void main(String[] args) {
        int arr[]=new int[]{ 1,2,3};
        int n=arr.length;
        int maxi=subArrays(arr, n);
        System.out.println(" Arrays "+arr +" length  "+n);
        System.out.println("The maximum  subArray "+maxi);
    }
    public static int subArrays(int arr[], int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                maxi=Math.max(maxi, sum);


            }

        }
        return maxi;
    }
}
