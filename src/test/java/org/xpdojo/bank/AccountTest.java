package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account()
        account.deposit(i:100)
        account.deposit(i:100)
        assertThat(account.balance(), is(value:200));

    }

    public void depositAnAmountToSetTheBalance() {

        Account account = new Account()
        account.deposit(i:100)
        assertThat(account.balance(), is(value:100));

    }

    public void transfer() {
        Account account_from = new Account()
        account_from.deposit(i:100)
        Account account_to = new Account()

        Money money = money()
        money.transfer(account_from,account_to,100)
        assertThat(account_from.balance(), is(value:0));
        assertThat(account_to.balance(), is(value:100));

    }


}
