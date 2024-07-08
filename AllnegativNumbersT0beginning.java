package July2024;

import java.util.Arrays;

public class AllnegativNumbersT0beginning {
    public static void main(String args[]){

        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        mover(arr);
        for (int e : arr)
            System.out.print(e + " ");

    }
   /* Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
    Output: -12 -13 -5 -7 -3 -6 11 6 5*/

    public static void mover(int arr[]){
        Arrays.sort(arr);
    }
}
