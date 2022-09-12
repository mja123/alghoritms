package codeSignal.lvl8;

public class ArrayMaxConsecutiveSum {
    static int solution(int[] inputArray, int k) {

        int maxSum = 0;

        for (int i = 0; i < inputArray.length - k + 1; i++) {
            int groupSum = inputArray[i];

            for (int j = 1; j < k; j++) {
                groupSum += inputArray[j + i];
            }
            if (maxSum < groupSum) {
                maxSum = groupSum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4 };
        int k = 3;
        System.out.println(solution(array, k));
    }

}
