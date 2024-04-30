package Overloading;

public class overLoading {
    public static void main(String [] args){
        overLoading over=new overLoading();
       System.out.println( over.sum(1,2));

        System.out.println("......................................");

       System.out.println(over.multiplication(4,5));
       System.out.println("......................................");
      int summm= sum(1,2,3,4);
      System.out.println(summm);

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
    public String add(String a,String b){
        return a+b;
    }

}
