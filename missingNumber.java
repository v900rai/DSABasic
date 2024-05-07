package selfpractices;

public class missingNumber {
    public static void main(String []args){
        int arr[]={1,2,3,5};
        int n=5;
       int result= missingNumber(arr ,n);
        System.out.println(result);

    }
    public static int missingNumber(int arr[], int n){
        int sum=0;
        int total=0;
        for(int i=1; i<=n; i++){
            total=total+i;
        }
        for(int i=0; i<=arr.length-1; i++ ){
            sum+=arr[i];

        }
        return total-sum;
    }
}
