package hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
Coins = 400;
        Menu = { "coffee" : 100
        "cake" : 200
        "popcorn" : 225
        }
        Write a method that will show all possible combinations that can bought for coins*/
public class Coins {
    public static int combinations(int coins, int...products) {
        int result = 0;
        Set<String> combinations = new HashSet<>();
        StringBuilder combination = new StringBuilder();


        for (int i : products) {
            if (!combinations.contains(combination.toString())) {
                //Spending all the budget in only one product.
                combination.append(String.valueOf(i).repeat(Math.max(0, coins / i)));
                combinations.add(combination.toString());
                result += 1;
                combination.delete(0, combination.length() - 1);
            }
            int budget = coins;
            int iterations = 0;
            combination.append(i);
            budget -= i;
            while (((budget > 0) && (combinations.contains(combination.toString())))
                    || (iterations < (products.length * products.length))) {
                for (int j : products) {
                    if ((budget - j) >= 0) {
                        combination.append(j);
                        budget -= j;
                    }
                }
                iterations ++;
            }
            if (budget < Arrays.stream(products).min().getAsInt() && budget > 0) {
                combinations.add(combination.toString());
                result += 1;
            }

            combination.delete(0, combination.length() - 1);
        }
        combinations.forEach(System.out::println);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combinations(400, 100, 200, 250));
    }
}
