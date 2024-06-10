package selfpractices.InterviewOnly;

public class LeaderInArrays {
    public static void main(String []args){
        int arr[]={10,2,4,6,7,8,3,1};


        for(int i=0; i<arr.length; i++){
            boolean flag=false;
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(" find the value "+arr[i]);
            }
        }
        }
}
