package selfpractices.InterviewOnly;

public class StringLinearSearchProgram {
    public static  void main(String []args){
        String arr[]={" vishal "," rai ", "neha ", "dinga "+" kunj"};
        String item=" rai";
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(item)){
                System.out.println(" its is present in " +i+  " index position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item is not present in the list ");
        }
    }
}
