package codeSignal.companyChallenges.jet;

import java.util.*;

public class ShoppingCart {
    static String[] solution(String[] requests) {
        Map<String, Integer> products = new HashMap<>();

        int product = 0;
        for(String request : requests) {

            if (request.equals("checkout")) {
                if (product != requests.length - 1) {
                    products.clear();
                    continue;
                }
                break;
            }
            String[] actions = request.split(":");

            String currentProduct = actions[1].substring(1);

            switch(actions[0].trim()) {
                case "add":
                    if (products.containsKey(currentProduct)) {
                        products.put(currentProduct, products.get(currentProduct) + 1);
                    } else {
                        products.put(currentProduct, 1);
                    }
                    break;
                case "remove":
                    if (products.containsKey(currentProduct)) {
                        if (products.get(currentProduct) > 1) {
                            products.put(currentProduct, products.get(currentProduct) - 1);
                        } else {
                            products.remove(currentProduct);
                        }
                    }
                    break;

                default:
                    Integer value = Integer.parseInt(actions[2].trim().substring(1));
                    currentProduct = currentProduct.substring(0, currentProduct.length() - 1);

                    if (actions[2].charAt(1) == '+') {
                        if (products.containsKey(currentProduct)) {
                            products.put(currentProduct, products.get(currentProduct) + value);
                        } else {
                            products.put(currentProduct, value);
                        }
                    } else {
                        if (products.get(currentProduct) > value) {
                            products.put(currentProduct, products.get(currentProduct) - value);
                        } else {
                            products.remove(currentProduct);
                        }
                    }
                    break;
            }
            product++;
        }


        return products.entrySet().stream()
                .map(e -> e.getKey() + " : " + e.getValue())
                .toArray(String[]::new);

    }

    public static void main(String[] args) {
        Arrays.stream(solution(new String[]{
                "add : milk",
                "add : pickles",
                "add : fruitz",
                "add : vegetables",
                "add : computer",
                "add : whattheawesomeshopisit",
                "quantity_upd : computer : +2",
                "remove : computer",
                "remove : milk",
                "add : computer",
                "quantity_upd : fruitz : +100",
                "add : computer mouse",
                "add : computer monitor",
                "quantity_upd : computer mouse : +3",
                "quantity_upd : computer mouse : +5",
                "quantity_upd : computer : +3",
                "quantity_upd : fruitz : -50",
                "add : fruitz seed"}))
                .forEach(System.out::println);
    }

}
