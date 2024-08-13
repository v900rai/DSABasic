package AdvancedDataStructureInJava;

import java.util.HashMap;

public class retrieveHashset {
    public static void main(String ars[]){
        HashMap<String , Integer>  map=new HashMap<String , Integer>();
        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);

        //Retrieving a value associated with key 'TWO'

        int value = map.get("TWO");

        System.out.println(value);       //Output : 2
    }
}
