package autoboxing.exercise;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            return branches.add(new Branch(branchName));
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        if (printTransactions) {
            System.out.println("Customer details for branch " + branchName);
            int customerDisplayIndex = 1;
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + customerDisplayIndex + "]");
                customerDisplayIndex++;
                System.out.println("Transactions");
                int transactionIndex = 1;
                for (Double transaction : customer.getTransactions()) {
                    System.out.println("[" + transactionIndex + "] Amount " + transaction);
                    transactionIndex++;
                }
            }
            return true;
        }
        System.out.println("Customer details for branch " + branchName);
        int customerDisplayIndex = 1;
        for (Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + customerDisplayIndex + "]");
            customerDisplayIndex++;
        }
        return true;
    }
}
