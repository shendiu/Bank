package test;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class Test {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("John Don");
        Customer secondCustomer = new Customer("Jane O'Connor");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        Bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount) Bank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));
    }
}
