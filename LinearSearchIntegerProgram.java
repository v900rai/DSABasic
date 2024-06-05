package selfpractices.InterviewOnly;

public class LinearSearchIntegerProgram {
    public static void main(String []args){
        int arr[]={10,20,30,40,50,60};
        int item=2;
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item){
                System.out.println("item is present in "+i+" index position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Index is not present ");
        }
    }
}
