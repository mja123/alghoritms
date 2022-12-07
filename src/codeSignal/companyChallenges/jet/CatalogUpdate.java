package codeSignal.companyChallenges.jet;

import java.util.*;

public class CatalogUpdate {

    static String[][] solution(String[][] catalog, String[][] updates) {
        Map<String, List<String>> catalogUpdated = new HashMap<>();

        for (String[] category : catalog) {
            catalogUpdated.put(category[0], Arrays.asList(category));

        }

        for (String[] newProducts : updates) {
            String currentCategory = newProducts[0];

            if (catalogUpdated.containsKey(currentCategory)) {
                List<String> productAdded = new ArrayList<>(catalogUpdated.get(currentCategory));

                productAdded.addAll(Arrays.stream(newProducts)
                        .filter(p -> !p.equals(currentCategory))
                        .toList());

                catalogUpdated.put(currentCategory, productAdded);
            } else {
                catalogUpdated.put(currentCategory, Arrays.asList(newProducts));
            }
        }

        return catalogUpdated.values().stream()
                .map(c -> c.toArray(String[]::new))
                .toArray(String[][]::new);

    }

    public static void main(String[] args) {
        String[][] catalog = {{"Books","Classics","Fiction"},
            {"Electronics","Cell Phones","Computers","Ultimate item"},
            {"Grocery","Beverages","Snacks"},
            {"Snacks","Chocolate","Sweets"},
            {"root","Books","Electronics","Grocery"}};

        String[][] updates =
                {{"Snacks","Marmalade"},
                {"Fiction","Harry Potter"},
                {"root","T-shirts"},
                {"T-shirts","CodeSignal"}};

        Arrays.stream(solution(catalog, updates))
                .forEach(c -> {
                    Arrays.stream(c)
                            .forEach(p -> System.out.print(p + " "));
                    System.out.println(" ");
                });
    }
}
