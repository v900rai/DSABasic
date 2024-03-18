package JavaOops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayLis {
    public static void main(String [] args){
        List<String> list1=new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        //Sorting the list
        Collections.sort(list1);
        //Traversing list through the for-each loop
        for(String fruit:list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);
    }

}

