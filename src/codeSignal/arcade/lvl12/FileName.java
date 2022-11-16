package codeSignal.arcade.lvl12;

import java.util.*;

public class FileName {
    static String[] solution(String[] names) {
        Set<String> set = new HashSet<>();
        int index = 0;
        for (String currentName : names) {
            if (!set.contains(currentName)) {
                set.add(currentName);
            } else {
                int i = 1;
                String nameModified = currentName + "(1)";
                while (set.contains(nameModified)) {
                    nameModified = currentName + "(" + i + ")";
                    i++;
                }
                set.add(nameModified);
                names[index] = nameModified;
            }
            index++;
        }
        return names;
    }


    public static void main(String[] args) {
        String[] names = {"a(1)",
                "a(6)",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a"
        };
        Arrays.stream(solution(names)).forEach(System.out::println);
    }
}
