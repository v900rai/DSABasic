package selfpractices;

public class PrintLargestArraysThree {
    public static void print3largest(int arr[], int size){
        int first,second,third;
        if(size<3){
            System.out.println("Invailed Input ");
            return ;
        }
        third = first = second = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
              /* If arr[i] is in between first and
            second then update second  */
            else if(arr[i]>second){
                third=second;
                second=arr[i];

            }
            else if(arr[i]>third)
                third=arr[i];

            //System.out.println("Three largest elements are " + first + " " + second + " " + third);
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);

    }

    /* Driver program to test above function*/
    public static void main(String[] args)
    {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        print3largest(arr, n);
    }
}


