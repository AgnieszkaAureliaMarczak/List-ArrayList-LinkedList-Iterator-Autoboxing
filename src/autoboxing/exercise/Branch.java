package autoboxing.exercise;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            return customers.add(new Customer(customerName, initialTransaction));
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            return customer.getTransactions().add(transaction);
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
