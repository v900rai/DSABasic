package selfpractices;

public class LLl {
    public static int search(int arr[], int N, int key) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == key)
                return i;


        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 67, 78, 99};
        int key = 5;
        int result = search(arr, arr.length, key);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
