public class StringXOR {
    public static String stringXor(String string1, String string2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i) != string2.charAt(i)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringXor("10101", "00101"));
    }
}
