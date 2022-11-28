package codeSignal.companyChallenges.dropbox;

public class IncorrectPasswordAttempts {
    boolean solution(String passcode, String[] attempts) {

        int counter = 0;
        for (String password : attempts) {
            if (!passcode.equals(password)) {
                counter++;
            } else {
                if (counter > 9) {
                    return true;
                }
                counter = 0;
            }
        }
        return counter > 9;
    }

}
