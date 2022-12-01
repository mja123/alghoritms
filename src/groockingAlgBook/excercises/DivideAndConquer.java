package groockingAlgBook.excercises;

import java.util.ArrayList;
import java.util.List;

public class DivideAndConquer {
    public static Integer classicSummatory(List<Integer> elements) {
        if (elements.size() == 1) {
            return elements.get(0);
        }

        return elements.remove(0) + classicSummatory(elements);
    }

    public static Integer tailSummatory(List<Integer> elements, Integer summatory) {
        if (elements.size() == 1) {
            return summatory + elements.get(0);
        }
        summatory += elements.remove(0);

        return tailSummatory(elements, summatory);
    }

//    public static Integer maxNumberList(List<Integer> numbers) {
//
//    }

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
//        System.out.println(classicSummatory(elements));
        System.out.println(tailSummatory(elements, 0));
    }
}

/*
TODO:
 - Write a recursive function to count the number of items in a list.
 - Find the maximum number in a list
 - binary search
*/
