package selfpractices;

public class SwapValue {
    public static void main(String []args){
        String s1="vishal";
        String s2="Rai";
        System.out.println("before swapping  two String");
        System.out.println("s1  >"+s1);
        System.out.println("s2  >"+s2);
        String temp;
        temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("After Swapping two number");
        System.out.println("s1..>"+s1);
        System.out.println("s2  ..>"+s2);
    }


}
