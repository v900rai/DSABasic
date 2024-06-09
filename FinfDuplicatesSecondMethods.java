package selfpractices.InterviewOnly;

import java.util.Arrays;

public class FinfDuplicatesSecondMethods {
    public static void main(String[] args) {
         int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(array);
    }
    public static void findDuplicates(int arr[]){
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                System.out.println("Duplicate found: " + arr[i]);
            }
        }
    }
}
