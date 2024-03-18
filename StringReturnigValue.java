package JavaOops;

public class StringReturnigValue {
    public static void main(String[] args) {
        int n=str("vishal",'A');
        System.out.println(n);
    }
    public static int  str(String str1,char a){
        System.out.println(str1);
        System.out.println(a);
        return 10;
    }
}
