package interviews.billing;

import java.util.HashMap;
import java.util.Map;
class BillingStatus {
    private final Map<String, Integer> transactions;

    public BillingStatus() {
        this.transactions = new HashMap<>();
        setUpInitialTransactions();
    }

    public void addTransaction(String key, Integer value) {
        transactions.put(key, value);
    }

    public void showTransactions() {
        transactions.forEach((k, v) -> System.out.println("k  = " + k + " v = " + v));
    }

    private void setUpInitialTransactions() {
        addTransaction("Ad delivery pennies", 0);
        addTransaction("Payment pennies", 0);
    }
}
