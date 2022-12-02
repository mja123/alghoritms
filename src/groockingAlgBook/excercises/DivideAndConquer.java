package groockingAlgBook.excercises;

import java.util.ArrayList;
import java.util.Comparator;
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

    public static Integer maxNumberList(List<Integer> numbers) {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        if (numbers.get(0) > numbers.get(1)) {
            numbers.remove(1);
        } else {
            numbers.remove(0);
        }
        return maxNumberList(numbers);
    }

    public static Integer countElements(List<Integer> numbers) {
        if (numbers.size() == 1) {
            return 1;
        }

        numbers.remove(0);

        return 1 + countElements(numbers);
    }

    public static Integer tailCountElements(List<Integer> numbers, Integer count) {
        if (numbers.size() == 0) {
            return count;
        }
        numbers.remove(0);

        return tailCountElements(numbers, ++count);
    }

    public static Integer binarySearchDaC(List<Integer> numbers, int high, int low, int target) {
        int middleIndex = (high + low) / 2;
        Integer middleElement = numbers.get(middleIndex);

        if (middleElement == target) {
            return middleIndex;
        }
        if (target > middleElement) {
            low = middleIndex;
        } else {
            high = middleIndex;
        }

        return binarySearchDaC(numbers, high, low, target);
    }
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(7);
        elements.add(7);
        elements.add(4);
        elements.add(5);
//        System.out.println(classicSummatory(new ArrayList<>(elements)elements));
//        System.out.println(tailSummatory(new ArrayList<>(elements)elements, 0));
//        System.out.println(maxNumberList(new ArrayList<>(elements)elements));
//        System.out.println(countElements(new ArrayList<>(elements)elements));
//        System.out.println(tailCountElements(new ArrayList<>(elements), 0));
        List<Integer> elementsCopy = new ArrayList<>(elements);
        elementsCopy.sort(Comparator.naturalOrder());
        System.out.println(elementsCopy);
        System.out.println(binarySearchDaC(elementsCopy, elementsCopy.size(), 0, 4));
    }
}

/*
TODO:
 - Write a recursive function to count the number of items in a list.
 - Find the maximum number in a list
 - binary search
*/
