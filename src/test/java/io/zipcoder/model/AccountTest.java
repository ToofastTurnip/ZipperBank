package io.zipcoder.model;

import io.zipcoder.bank.model.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void accountIdTest() {
        Account account = new Account();
        account.setId(1);
        Integer expected = 1;
        Assert.assertEquals(expected, account.getId());
    }

    @Test
    public void accountNicknameTest() {
        Account account = new Account();
        account.setNickname("Account One");
        String expected = "Account One";
        Assert.assertEquals(expected, account.getNickname());
    }

    @Test
    public void accountRewardsTest() {
        Account account = new Account();
        account.setRewards(22);
        Integer expected = 22;
        Assert.assertEquals(expected, account.getRewards());
    }

    @Test
    public void accountBalanceTest() {
        Account account = new Account();
        account.setBalance(1923.86);
        Double expected = 1923.86;
        Assert.assertEquals(expected, account.getBalance());
    }

    // More tests for the noted out methods

}
