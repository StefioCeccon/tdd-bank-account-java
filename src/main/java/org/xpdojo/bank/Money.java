package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    public void transfer(Account: account_from, Account: account_to, int: transfer_amount) {
        account_from.withdraw(transfer_amount)
        account_to.deposit(transfer_amount)
    }



}
