package test;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class Test {
    public static void main(String[] args) {

        Bank myBank = new Bank();
        Customer firstCustomer = new Customer("John Don");
        Customer secondCustomer = new Customer("Jane O'Connor");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount janeAccount = new CheckingAccount(500,100);
        CheckingAccount johnAccount = new CheckingAccount(5000,1000);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        myBank.addCustomer(firstCustomer);
        myBank.addCustomer(secondCustomer);


        System.out.println(myBank.getCustomer(0));
        myBank.getCustomer(0).getAccount(0).deposit(2000);
        myBank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount) myBank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(myBank.getCustomer(0).getAccount(0).getBalance());
        System.out.println(myBank.getCustomer(0).getAccount(1).getBalance());

    }
}
