package interviews.reDoing;

public class NumberCharAddition {
    public static int solutionLoop(int number) {
        int digits = String.valueOf(number).length();
        int count = 0;

        while (digits != 0) {
            count += number % 10;
            number /= 10;
            digits--;
        }
        return count;
    }

    public static int solutionFunctional(int number) {
        return String.valueOf(number)
                .chars()
                .reduce(0, (s, n) -> s + Character.getNumericValue(n));
//        return String.valueOf(number)
//                .chars()
//                .map(Character::getNumericValue)
//                .sum();
    }
    public static void main(String[] args) {
        int number = 345;
        System.out.println(solutionLoop(number));
        System.out.println(solutionFunctional(number));
    }
}
