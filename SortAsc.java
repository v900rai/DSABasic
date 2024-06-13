package selfpractices.InterviewOnly;

public class SortAsc {
    public static void main(String []args){
        int arr[]=new int[]{2,4,8,5,1};
        int temp=0;
        for(int i=0; i<arr.length; i++){
            System.out.println( "Elements of original array");
            System.out.println(+arr[i]);
        }
        // assecnding
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]==arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // assincding
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
