package com.mybank.domain;

/*
Bank Account class
 */

public class Account {
    protected double balance;

    public double getBalance() {
        return balance;
    }

    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    public Account(){
        this.balance=0;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
