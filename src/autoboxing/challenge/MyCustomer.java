package autoboxing.challenge;

import java.util.ArrayList;

public class MyCustomer {
    private String name;
    private ArrayList<Double> transactions;

    public MyCustomer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyCustomer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
