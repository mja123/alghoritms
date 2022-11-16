package codeSignal.arcade.lvl4;

public class ArrayChange {
    static int solution(int[] inputArray) {
        int counter = 0;
        int increment = 0;
        boolean smaller = false;

        for (int i = 0; i < inputArray.length - 1; i++) {

            if (smaller) {
                inputArray[i] += increment;
            }

            if (inputArray[i] < inputArray[i + 1]) {
                smaller = false;
                continue;
            }

            increment = (inputArray[i] - inputArray[i + 1]) + 1;
            counter += increment;
            smaller = true;
        }

        return counter;
    }
    public static void main(String[] args){
        int[] array = {1, 1, 1};
        System.out.println(solution(array));
    }
}
