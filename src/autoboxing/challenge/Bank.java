package autoboxing.challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<MyCustomer> myCustomers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private MyCustomer getCustomer(String customerName) {
        for (var customer : myCustomers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addCustomer(String customerName) {
        if (getCustomer(customerName) == null) {
            MyCustomer myCustomer = new MyCustomer(customerName);
            myCustomers.add(myCustomer);
            System.out.println("New Customer added: " + myCustomer);
        }
    }

    public void addTransaction(String name, double transaction) {
        MyCustomer myCustomer = getCustomer(name);
        if (myCustomer != null) {
            myCustomer.getTransactions().add(transaction);
        }
    }

    public void printStatement(String customerName) {
        MyCustomer myCustomer = getCustomer(customerName);
        if (myCustomer == null) {
            return;
        }

        System.out.println("_".repeat(30));
        System.out.println("Customer Name: " + myCustomer.getName());
        System.out.println("Transactions: ");
        for (double d : myCustomer.getTransactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
