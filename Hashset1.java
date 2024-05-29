package selfpractices;
import java.util.*;

public class Hashset1 {
    // Java program to Illustrate Traversal over HashSet
// Using an iterator

// Importing required classes


    // Main class


        // Main driver method
        public static void main(String[] args)
        {
            // Creating empty HashSet by declaring object
            // of HashSet class of string type
            HashSet<String> h = new HashSet<String>();

            // Adding elements into HashSet
            // using add() method
            h.add("Geeks ");
            h.add("for   ");
            h.add("Geeks ");
            h.add("vishal rai");

            // Iterating over HashSet elements
            // using iterator
            Iterator<String> i = h.iterator();

            // Holds true till there is single element remaining
            // in the Set
            while (i.hasNext())

                // Printing the elements
                System.out.println(i.next());
        }
    }


