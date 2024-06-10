package RecursionAllProgram;

public class ReversRecursion {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50};
        int a=0;
        int b=arr.length-1;
       // for (int i = 0; i <=arr.length/2;  i++) {
        while (a<=b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }

        for (int i = 0; i <=arr.length-1;  i++) {
            System.out.print(arr[i]+"");

        }
        System.out.println();

    }
}
