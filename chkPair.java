package July2024;

public class chkPair {
    public static void main(String[] args)
    {

        int A[] = { 0, -1, 2, -3, 1 };
        int x = -2;
        int size = A.length;

        if (chkPair(A, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
     static boolean chkPair(int arr[], int size,int x){
        for(int i=0; i<(size-1); i++){
            for(int j=(i+1); j <size; j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }


            }
        }
return false;

    }
}
