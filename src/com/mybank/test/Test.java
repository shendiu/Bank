package com.mybank.test;

import com.mybank.domain.*;

public class Test {
    public static void main(String[] args) {

        Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("John","Don");
        Customer secondCustomer = new Customer("Jane","O'Connor");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);

        displayCustomers(bank);

        bank.getCustomer(0).getAccount(0).deposit(2000);
        try {
            bank.getCustomer(0).getAccount(1).withdraw(7500);
        } catch (OverdraftException oe) {
            System.out.println(oe.getMessage() + ": $" + oe.getDeficit() + "!\n");
        } catch (Exception e) {
            System.out.println("Something went wrong:-(");
        }
        ((SavingsAccount) bank.getCustomer(0).getAccount(0)).addInterestRate();

        displayCustomers(bank);
    }

    private static void displayCustomers(Bank bank) {
        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));
    }
}
