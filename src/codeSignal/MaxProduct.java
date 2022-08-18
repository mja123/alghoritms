package codeSignal;

public class MaxProduct {
    static int solution(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        int currentProduct;

        for (int i = 0; i < inputArray.length - 1; i++) {

            currentProduct = (inputArray[i] * inputArray[i + 1]);

            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }

        return maxProduct;
    }

}
