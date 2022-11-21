package groockingAlgBook.excercises;

import java.util.HashMap;
import java.util.Map;

public class BigOComparator {
    public static Map<String, Map<String, Long>> notationsSpeed = new HashMap<>();

    public static void main(String[] args) {
        showUnitComparator("seconds", 1028);
    }
    public static void showUnitComparator(String unitTime, long operations) {
        fillNotationsSpeeds(operations);
        notationsSpeed.forEach((k, v) -> System.out.println(k + " " + v.get(unitTime)));
    }
    public static void fillNotationsSpeeds(long operations) {

        long logarithm = (long)(Math.log(operations) / Math.log(2));

        notationsSpeed.put("Logarithmic", notationOperations(logarithm));
        notationsSpeed.put("Linear", notationOperations(operations));
        notationsSpeed.put("N log", notationOperations(operations * logarithm));
        notationsSpeed.put("Exponential", notationOperations(operations * operations));
        notationsSpeed.put("Factorial", notationOperations(factorial(operations)));
    }

    public static long factorial(long n) {

        if (n == 1) {
            return n;
        }
        return n * factorial( n - 1);
    }
    public static long timeConverter(String unit, long number) {
        return (switch (unit) {
            case "seconds" -> number / 10;
            case "minutes" -> number / 60;
            case "hours" -> timeConverter("minutes", number) / 60;
            case "days" -> timeConverter("hours", number) / 24;
            case "weeks" -> timeConverter("days", number) / 7;
            case "months" -> timeConverter("days", number) / 30;
            default -> timeConverter("days", number) / 365;
        });
    }

    public static Map<String, Long> notationOperations(long number) {
        Map<String, Long> timeUnits = new HashMap<>();
        timeUnits.put("seconds", timeConverter("seconds", number));
        timeUnits.put("minutes", timeConverter("minutes", number));
        timeUnits.put("hours", timeConverter("hours", number));
        timeUnits.put("days", timeConverter("days", number));
        timeUnits.put("weeks", timeConverter("weeks", number));
        timeUnits.put("months", timeConverter("months", number));
        timeUnits.put("years", timeConverter("years", number));

        return timeUnits;
    }
}
