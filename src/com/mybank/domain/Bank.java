package com.mybank.domain;

public class Bank {
    private final Customer[] customers = new Customer[1000];
    private int numOfClients = 0;
    private static Bank myBank = new Bank();

    public static Bank getBank() {
        myBank = new Bank();
        return myBank;
    }

    private Bank() {

    }

    public Customer getCustomer(int customerNo) {
        if (customerNo < customers.length)
            return customers[customerNo];
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }
}
