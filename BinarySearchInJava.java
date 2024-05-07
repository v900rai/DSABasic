package selfpractices;

public class BinarySearchInJava {
    public static int binarySearch(int arr[] , int start , int end, int key){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearchInJava ob=new  BinarySearchInJava();

        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length-1;
        int x = 1;
        int result =ob.binarySearch(arr, 0, n, 10);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);

    }
}
