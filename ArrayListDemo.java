package July2024;


    // Java code to illustrate add(Object o)
import java.io.*;
import java.util.ArrayList;

    public class ArrayListDemo {
        public static void main(String[] args)
        {

            // create an empty array list with an initial capacity
            ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

            // use add() method to add elements in the list
            arrlist.add(15);
            arrlist.add(20);
            arrlist.add(25);
            arrlist.add(66);
            arrlist.add(66);
            arrlist.add(66);


            // prints all the elements available in list
            for (Integer number : arrlist) {
                System.out.println("Number = " + number);
            }
        }
    }


