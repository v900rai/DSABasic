package selfpractices;

public class substringInJava {
    // Java code to demonstrate the
// working of substring(int begIndex)

        public static void main(String args[])
        {

            // Initializing String
            String Str = new String("Welcome to geeksforgeeks");

            // using substring() to extract substring
            // returns (whiteSpace)geeksforgeeks

            System.out.print("The extracted substring is : ");
            System.out.println(Str.substring(15));
        }
    }


