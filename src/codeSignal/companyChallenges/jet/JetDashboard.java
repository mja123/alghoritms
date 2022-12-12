package codeSignal.companyChallenges.jet;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JetDashboard {
    static double[][] solution(int[] orders, int n) {
        double[][] statics = new double[n][3];

        int lastElementRange = n;
        int currentIndex = 0;
        for (int i = orders.length - n; i < orders.length; i++) {

            int[] currentElements = new int[lastElementRange - n + 1];
            System.arraycopy(orders, orders.length - n, currentElements,0 , lastElementRange - n + 1);

            statics[currentIndex][0] = Arrays.stream(currentElements).max().getAsInt();
            double average = (double) Arrays.stream(currentElements).reduce(Integer::sum).getAsInt() / currentElements.length;

            statics[currentIndex][1] = average;
            statics[currentIndex][2] = currentElements.length == 1 ? -1 : standardDeviation(currentElements, average);

            lastElementRange++;
            currentIndex++;
        }
        return statics;
    }

    static double standardDeviation(int[] currentElements, double average) {
        double result = 0;

        for (int currentElement : currentElements) {
            result += Math.pow(currentElement - average, 2);
        }

        return Math.pow(result, 0.5) / (double) (currentElements.length - 1);
    }

    public static void main(String[] args) {
        int[] orders = {4, 2, 5, 9, 2};
        int n = 3;

        Arrays.stream(solution(orders, n)).forEach(r -> {
            Arrays.stream(r).forEach(c -> System.out.print(c + " "));
            System.out.println(" ");
        });
    }
}
