package July2024;

public class StaticExample {
    // Java program to demonstrate that static
// block is executed before main()



        // static block
        static
        {
            System.out.println("Inside Static Block.");
        }

        // main method
        public static void main(String args[])
        {
            System.out.println("Inside main method.");
        }
    }


