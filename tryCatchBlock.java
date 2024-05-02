package selfpractices;

public class tryCatchBlock {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        /*(Exception e){
            System.out.println("Arithmetic Exceptions ");
        }*/
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
