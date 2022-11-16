package codeSignal.arcade.lvl10;

public class EmailDomain {
    String solution(String address) {
        String[] emailParts = address.split("@", -2);

        return emailParts[emailParts.length - 1];
    }

}
