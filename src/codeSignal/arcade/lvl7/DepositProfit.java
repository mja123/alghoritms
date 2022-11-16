package codeSignal.arcade.lvl7;

public class DepositProfit {
    int solution(int deposit, int rate, int threshold) {
        int years = 0;
        float floatDeposit = (float) deposit;

        while (floatDeposit < threshold) {
            floatDeposit = (floatDeposit * (1 + ((float)rate / 100)));
            years++;
        }
        return years;
    }

}
