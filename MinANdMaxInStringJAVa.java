package selfpractices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MinANdMaxInStringJAVa {
    // This java program find minimum and maximum value
// of an unsorted list of Integer by using Collection



        // function to find minimum value in an unsorted
        // list in Java using Collection
        public static Integer findMin(List<Integer> list)
        {

            // check list is empty or not
            if (list == null || list.size() == 0) {
                return Integer.MAX_VALUE;
            }

            // create a new list to avoid modification
            // in the original list
            List<Integer> sortedlist = new ArrayList<>(list);

            // sort list in natural order
            Collections.sort(sortedlist);

            // first element in the sorted list
            // would be minimum
            return sortedlist.get(0);
        }

        // function return maximum value in an unsorted
        // list in Java using Collection
        public static Integer findMax(List<Integer> list)
        {

            // check list is empty or not
            if (list == null || list.size() == 0) {
                return Integer.MIN_VALUE;
            }

            // create a new list to avoid modification
            // in the original list
            List<Integer> sortedlist = new ArrayList<>(list);

            // sort list in natural order
            Collections.sort(sortedlist);

            // last element in the sorted list would be maximum
            return sortedlist.get(sortedlist.size() - 1);
        }

        public static void main(String[] args)
        {

            // create an ArrayList Object list
            List<Integer> list = new ArrayList<>();

            // add element in ArrayList object list
            list.add(44);
            list.add(11);
            list.add(22);
            list.add(33);

            // print min and max value of ArrayList
            System.out.println("Min: " + findMin(list));
            System.out.println("Max: " + findMax(list));
        }
    }


