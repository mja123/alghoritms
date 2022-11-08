package interviews.billing;

import java.util.HashMap;
import java.util.Map;

public class Billing {
    private static final Map<Integer, BillingStatus> userTransactions;
    private static Integer id;

    static {
        userTransactions = new HashMap<>();
        id = 1;
    }


    public static void addUser() {
        userTransactions.put(id, new BillingStatus());
        id++;
    }

    public static void showUserTransactions(Integer id) {
        if (validateUserId(id)) {
            System.out.println("Id = " + id);
            userTransactions.get(id).showTransactions();
        } else {
            System.out.println("Invalid id!");
        }

    }

    public static void addUserTransaction(Integer id, String key, Integer value) {
        if (validateUserId(id)) {
            BillingStatus transaction = userTransactions.get(id);
            transaction.addTransaction(key, value);
        } else {
            System.out.println("Invalid id!");
        }


    }

    private static boolean validateUserId(Integer id) {
        return userTransactions.containsKey(id);
    }

    public static void main(String[] args) {
        Billing.addUser();
        Billing.addUser();
        Billing.addUserTransaction(1, "Salaries", 10000);
        Billing.showUserTransactions(1);
        Billing.addUserTransaction(2, "Food", 500);
        Billing.showUserTransactions(2);
        Billing.addUserTransaction(5, "Food", 500);
        Billing.showUserTransactions(5);

    }
}


