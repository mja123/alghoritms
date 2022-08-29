package codeSignal.lvl5;

public class IsIpv4Adress {
    /* Better solution
    boolean solution(String inputString) {
    String[] splitString = inputString.split("[.]");
    if (splitString.length > 4) {
        return false;
    }
    for (String string : splitString) {
        if (string.isEmpty()) {
            return false;
        }
        if (!string.matches("[0-9]{1,3}")) {
            return false;
        }
        int number = Integer.parseInt(string);
        if (!(number >= 0 && number <= 255)) {
            return false;
        }
    }
    return true;
}
     */

    static boolean solution(String inputString) {
        String[] bytes = inputString.split("\\.", -1);

        if (bytes.length != 4) {
            return false;
        }
        for (String group : bytes) {
            if ((group.matches(".*[a-z].*")) || (group.equals("")) || (group.matches("0[0-9]"))) {
                return false;
            }

            long value = Long.parseLong(group);
            if ((value >= 256) || (value <= -1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String ip = "172.16.254.1a";
        System.out.println(solution(ip));
    }

}
