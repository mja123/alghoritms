package codeSignal.lvl12;

public class ValidTime {
    boolean solution(String time) {
        String[] timeComponents = time.split(":");

        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);

        return ((hours >= 00 && hours <= 23) && (minutes >= 00 && minutes <= 59));
    }

}
