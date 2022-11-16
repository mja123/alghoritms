package codeSignal.interview.arrays;

public class IsCryptSolution {
    boolean solution(String[] crypt, char[][] solution) {
        String[] decoded = {"","",""};

        for (int word = 0; word < decoded.length; word++) {
            for (char letter : crypt[word].toCharArray()) {
                for (char[] chars : solution) {
                    if (chars[0] == letter) {
                        decoded[word] += (String.valueOf(chars[1]));
                        break;
                    }
                }
            }
        }

        if (decoded[2].length() > 1) {
            if (decoded[0].charAt(0) == '0' || decoded[1].charAt(0) == '0') {
                return false;
            }
        }

        return (Long.parseLong(decoded[0]) + Long.parseLong(decoded[1])) == Long.parseLong(decoded[2]);

    }

}
