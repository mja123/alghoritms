package interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Coins = 400;
        Menu = { "coffee" : 100
        "cake" : 200
        "popcorn" : 225
        }
        Write a method that will show all possible combinations that can bought for coins*/
public class Coins {
    public static int combinations(int coins, int...products) {
        Set<String> combinations = new HashSet<>();
        StringBuilder combination = new StringBuilder();

        for (int i : products) {
            //Spending all the budget in only one product.
            for (int j = 1; j < (coins / i) + 1; j++) {
                combination.append(String.valueOf(i).repeat(j));
                combinations.add(combination.toString());
                combination.delete(0, combination.length() - 1);
            }

            int budget = coins - i;
            combination.append(i);

            //Mixing products
            for (int j : products) {
                if ((budget - j) >= 0) {
                    combination.append(j);
                    budget -= j;
                }
                if (budget < Arrays.stream(products).min().getAsInt()) {
                    break;
                }
            }
            combinations.forEach(System.out::println);
            combinations.add(combination.toString());
            combination.delete(0, combination.length() - 1);
        }

        return combinations.size();
    }
    public static void main(String[] args) {
        System.out.println(combinations(400, 100, 200, 250, 300));
    }
}
