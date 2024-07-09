package July2024;


    // Java code to illustrate
// void add(int index, Object element)
import java.io.*;
import java.util.ArrayList;

    public class ArrayListDem {
        public static void main(String[] args)
        {

            // create an empty array list with an initial capacity
            ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

            // use add() method to add elements in the list
            arrlist.add(10);
            arrlist.add(22);
            arrlist.add(30);
            arrlist.add(40);
            arrlist.add(55);
            System.out.println("Before the program ");
            for (Integer number : arrlist) {
                System.out.println("Number = " + number);
            }


            // adding element 35 at fourth position
            arrlist.add(3, 35);
//sou
            System.out.println("after the indexing changes  ");
            // let us print all the elements available in list
            for (Integer number : arrlist) {
                System.out.println("Number = " + number);
            }
        }
    }


