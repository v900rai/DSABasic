package selfpractices.InterviewOnly;

import java.util.ArrayList;

public class Arrayslistiterate {
    public static void main(String[] args) {

        // creating an array list
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("ArrayList: " + animals);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String language : animals) {
            System.out.print(language);
            System.out.print(", ");
        }
    }
}
