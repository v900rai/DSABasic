package selfpractices;

public class printEndTheZeros {
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
    public static void pushZerosToEnd(int arr[],int n){
        int len=arr.length;
        int count=0;
        for(int i=0; i<len; i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count<len){
            arr[count++]=0;
        }
    }
}
