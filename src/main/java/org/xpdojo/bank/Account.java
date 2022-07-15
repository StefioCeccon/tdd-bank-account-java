package org.xpdojo.bank;

public class Account {

   int balance = 0;

    public void balance() {
        return balance;
    }

    public void deposit(int i:0) {
        balance = balance + i;
    }

    public void withdraw(int i:0) {
        balance = balance - i;
    }

}
