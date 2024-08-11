package OOPSJAVA.POLYMORSIM;

public class methodOverloading2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;

    }
}

    class main{
        public static void main(String[] args) {
            System.out.println(methodOverloading2.add(11,11));
            System.out.println(methodOverloading2.add(112.3,12.6));
        }
    }


