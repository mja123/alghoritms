package codeSignal.arcade.lvl12;

public class MessageBinaryCode {
    static String solution(String code) {
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < code.length(); i += 8) {
            message.append((i + 8 <= code.length()) ? decodingBinary(code.substring(i, i + 8)) : decodingBinary(code.substring(i)));
        }
        return message.toString();
    }

    static char decodingBinary(String binary) {
        int digit = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (i == 7 && String.valueOf(binary.charAt(i)).equals("0")) {
                continue;
            }
            digit += Math.pow(Integer.parseInt(String.valueOf(binary.charAt(i))) * 2, binary.length() - i - 1);
        }
        System.out.println(digit);

        return (char) digit;
    }

    public static void main(String[] args) {
        System.out.println(solution("010010000110010101101100011011000110111100100001"));
    }

}
