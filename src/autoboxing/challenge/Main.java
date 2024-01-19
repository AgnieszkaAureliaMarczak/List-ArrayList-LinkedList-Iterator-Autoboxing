package autoboxing.challenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {

        Bank newBank = new Bank("Barclays");

        newBank.addCustomer("John");
        newBank.addTransaction("John", -5.00);
        newBank.addTransaction("John", 15.00);
        newBank.addTransaction("John", 25.00);
        newBank.printStatement("John");

        newBank.addCustomer("Jane");
        newBank.addTransaction("Jane", 25.20);
        newBank.addTransaction("jane", -50);
        newBank.addTransaction("JANE", 120.10);
        newBank.printStatement("Jane");

        newBank.addTransaction("Bob", 50);
        newBank.printStatement("bob");
    }
}
