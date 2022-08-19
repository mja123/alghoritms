package codeSignal.lvl3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    String[] solution(String[] inputArray) {
        List<String> words = Arrays.stream(inputArray).toList();
        Optional<String> maxLength = words.stream().max(Comparator.comparing(String::length));
        return words.stream().filter(w -> w.length() == maxLength.get().length()).toArray(String[]::new);
    }
}
