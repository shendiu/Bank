package com.mybank.test;

import com.mybank.domain.Bank;
import com.mybank.domain.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankTest {

    @Test
    void testGetNumOfClients() {
        Bank bank = Bank.getBank();
        Customer testCustomer = new Customer("Test1","Test2");
//    SavingsAccount testSavingsAccount = new SavingsAccount(1000,5);
//    testCustomer.addAccount(testSavingsAccount);
        bank.addCustomer(testCustomer);
        int testNumOfClients = bank.getNumOfClients();

        Assertions.assertEquals(1, testNumOfClients);
    }

}