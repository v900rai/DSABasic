package selfpractices;

public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,7,4,7};
        int key=3;
        int result=search(arr,arr.length, key);
        if  (result==-1){
            System.out.println("Element is not present in arrays");
        }
        else{
            System.out.println("Element is present at index "
                    + result);
        }
    }
    public static int search(int arr[], int n, int x){
        for(int i=0; i<n; i++){
            if(arr[i]==x)
                return i;


        }
        return -1;
    }
}
