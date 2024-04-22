package selfpractices;

import java.util.ArrayList;
import java.util.Collections;

public class biggestOfThreeCollections {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        //ArarysList
        ArrayList <Integer> st=new ArrayList<>();
        st.add(a);
        st.add(b);
        st.add(c);
        System.out.println(Collections.max(st)+" MaximumNumber here ");
    }
}
