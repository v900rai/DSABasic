package selfpractices;

public class DivisionFinallyBlock {
    public static void main(String[] args)
    {
        int a = 10, b = 5, c = 4, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }

        catch (ArithmeticException e) {
           // System.out.println("Exception caught:Division by zero");
            e.printStackTrace();
        }

        finally {
            System.out.println("I am in final block");
        }
    }
}
