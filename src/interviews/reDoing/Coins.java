package interviews.reDoing;

import java.util.*;

public class Coins {
    public static Set<List<String>> combinations(int coins, Map<String, Integer> products) {
        Set<List<String>> combinations = new HashSet<>();
        int minProduct = products.values().stream().min(Comparator.naturalOrder()).get();

        for (Map.Entry<String, Integer> product : products.entrySet()) {

            //Spending the budget in only one product.
            combinations.add(spendingAllInOneProduct(coins, product, new LinkedList<>(), combinations));

            int budget = coins - product.getValue();
            List<String> combination = new LinkedList<>();
            combination.add(product.getKey());

            //Mixing products
            for (Map.Entry<String, Integer> otherProduct : products.entrySet()) {
                if ((budget - otherProduct.getValue()) >= 0) {
                    combination.add(otherProduct.getKey());
                    budget -= otherProduct.getValue();
                }
                if (budget < minProduct) {
                    if (checkCombination(combinations, combination)) {
                        combinations.add(combination);
                    }
                    break;
                }
            }
        }

        return combinations;
    }

    private static boolean checkCombination(Set<List<String>> combinations, List<String> combination) {
        for (List<String> combinationSaved : combinations) {
            if (new HashSet<>(combinationSaved).containsAll(combination)) {
                return false;
            }
        }
        return true;
    }
    private static List<String> spendingAllInOneProduct(int budget, Map.Entry<String, Integer> product, List<String> cart, Set<List<String>> combinations) {
        if (budget < product.getValue()) {
            return cart;
        }

        cart.add(product.getKey());
        budget -= product.getValue();
        //Buying the product and saving money
        combinations.add(new LinkedList<>(cart));

        return spendingAllInOneProduct(budget, product, cart, combinations);
    }

    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("coffee", 100);
        products.put("cake", 200);
        products.put("popcorn", 225);

        int coins = 1000;

        combinations(coins, products).forEach(l -> {
            l.forEach(p -> System.out.print(p + " "));
            System.out.println("");
        });
    }
}
