package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static sun.nio.cs.Surrogate.is;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        account.deposit(100);
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(200);

    }

    public void depositAnAmountToSetTheBalance() {

        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);

    }

    public void transfer() {
        Account account_from = new Account();
        account_from.deposit(100);
        Account account_to = new Account();

        Money money = new Money();
        money.transfer(account_from,account_to,100);
        assertThat(account_from.balance()).isEqualTo(0);
        assertThat(account_to.balance()).isEqualTo(100);

    }


}
