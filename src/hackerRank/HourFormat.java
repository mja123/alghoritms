package hackerRank;

public class HourFormat {

    public static String timeConversion(String s) {
        String[] strings = s.split(":");

        Integer hourInt = Integer.parseInt(strings[0]);

            if ((hourInt == 12) && (strings[2].contains("AM"))) {
                hourInt -= 12;
                String hourResult = "0";
                hourResult = hourResult.concat(String.valueOf(hourInt));
                s = s.replace(strings[0], hourResult);
            }
            if (strings[2].contains("PM") && hourInt < 12) {

                s = s.replace(strings[0], String.valueOf(hourInt + 12));
        }
        return s.split("[A-Z]")[0];
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
}
