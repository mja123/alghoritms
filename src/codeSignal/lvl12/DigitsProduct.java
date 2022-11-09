package codeSignal.lvl12;

public class DigitsProduct {
    static int solution(int product) {
        if (product < 10) {
            return product == 0 ? 10 : product;
        }

        StringBuilder digits = new StringBuilder();
        for (int i = 9; i > 1; i--)
            //Enter in the for only if product is divisible by i
            for (; product % i == 0; product /= i)
                digits.append(i);

        return product == 1 ? Integer.parseInt(digits.reverse().toString()) : -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(243));
    }

}
