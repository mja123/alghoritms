package interviews;

import java.util.*;
import java.util.stream.Collectors;


/**
        * Input:
        * String line = "123 456 231 546 231 312 4556";
        * <p>
 * Output:
         * 123, 231, 231, 312 - are numeric anagrams
         * 456, 546 - are numeric anagrams
         * 4556 - has no anagrams
         **/
public class NumericAnagram {
    private static List<List<String>> anagrams(String line) {
        String[] numbers = line.split("\\s");

        List<List<String>> result = new ArrayList<>();
        Set<String> sortedNumbers = new HashSet<>();
        List<String> anagramNumbers;

        for (String number : numbers) {
            StringBuilder currentNumber = new StringBuilder(number);
            char[] letters = number.toCharArray();

            Arrays.sort(letters);
            number = String.valueOf(letters);

            if (result.isEmpty()) {
                anagramNumbers = new ArrayList<>();

                anagramNumbers.add(currentNumber.toString());
                anagramNumbers.add(", ");
                sortedNumbers.add(number);

                result.add(anagramNumbers);
            } else {
                boolean added = false;
                for (List<String> anagramType : result) {
                    if (sortedNumbers.contains(number) && anagramType.get(0).equals(number)) {
                        anagramType.add(currentNumber.toString());
                        anagramType.add(", ");
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    anagramNumbers = new ArrayList<>();

                    anagramNumbers.add(currentNumber.toString());
                    anagramNumbers.add(", ");
                    result.add(anagramNumbers);

                    sortedNumbers.add(number);
                }
            }
        }
        for (List<String> anagramType : result) {
            anagramType.remove(anagramType.size() - 1);

            if (anagramType.size() > 2) {
                anagramType.add(" - are numeric anagrams");
            } else {
                anagramType.add(" - has no anagrams");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String line = "123 456 546 231 231 312 4556";

        anagrams(line).forEach(a -> {
            a.forEach(System.out::print);
            System.out.println(" ");
        });
    }

}
