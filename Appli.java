package selfpractices;

public class Appli {
    // Java code to demonstrate the
// application of substring()

    // Driver Class

        // main function
        public static void main(String args[])
        {
            // Initializing String
            String Str = new String("Rs 1000");

            // Printing original string
            System.out.print("The original string is : ");
            System.out.println(Str);

            // using substring() to extract substring
            // returns 1000
            System.out.print("The extracted substring is : ");
            System.out.println(Str.substring(3));
        }


}
