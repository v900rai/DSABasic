package BasicRecursion;

public class armstrongNUmber {
    public static void main(String[] args) {
        int num=153;
        int temp = num;
        int sum=0;
        while (temp>0){
            int rem=temp%10;
            sum=(rem*rem*rem)+sum;
            temp=temp/10;

        }
        if(sum==num){
            System.out.println(sum);
        }
    }
}
