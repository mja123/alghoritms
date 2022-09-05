package codeSignal.lvl7;

/*
Better solution:
 return (firstNumber + n / 2)%n;
 */
public class CircleOfNumbers {

    int solution(int n, int firstNumber) {
        int result = ((n / 2) + firstNumber);

        if (result >= n) {
            result = Math.abs((result - n));
        }
        return result;
    }
}
