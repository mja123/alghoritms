public class CesarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();

        if (k > 26) {
            k = k % 26;
        }

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);

            if (!Character.isAlphabetic(character)) {
                result.append(character);
                continue;
            }
            if ((Character.isUpperCase(character) && (character + k) > 'Z')
                    || (Character.isLowerCase(character) && (character + k) > 'z')) {
                result.append((char)((character + k) - 26));
            } else {
                result.append((char)(character + k));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(caesarCipher("There's-a-starman-waiting-in-the-sky", 3));

        System.out.println(caesarCipher("www.abc.xy",87));
    }
}
