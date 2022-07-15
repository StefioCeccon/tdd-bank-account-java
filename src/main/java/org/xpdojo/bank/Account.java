package org.xpdojo.bank;

public class Account {

   int balance = 0;

    public int balance() {
        return this.balance;
    }

    public void deposit(int i) {
        this.balance = this.balance + i;
    }

    public void withdraw(int i) {
        this.balance = this.balance - i;
    }

}
