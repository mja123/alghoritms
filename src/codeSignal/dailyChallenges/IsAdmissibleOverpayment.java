package codeSignal.dailyChallenges;

public class IsAdmissibleOverpayment {
    boolean solution(double[] prices, String[] notes, double x) {
        double differences = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i].equals("Same as in-store")) {
                continue;
            }

            double percentage = Double.parseDouble(notes[i].split("%")[0]) / 100;

            if (notes[i].contains("higher")) {
                differences += ((prices[i] * percentage) / (1 + percentage));
            } else {
                differences -= (prices[i] / (1 - percentage) - prices[i]);
            }
        }

        return x >= differences;
    }
}
