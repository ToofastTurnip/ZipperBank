package io.zipcoder.model;

import io.zipcoder.bank.enums.Medium;
import io.zipcoder.bank.enums.Status;
import io.zipcoder.bank.enums.Type;
import io.zipcoder.bank.model.Withdrawal;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.Temporal;

public class WithdrawalTest {

    @Test
    public void withdrawalIdTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setId(8);
        Integer expected = 8;
        Assert.assertEquals(expected,withdrawal.getId());
    }

    @Test
    public void withdrawalTypeTest() {
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setType(Type.CHECKING);
        Type expected = Type.CHECKING;
        Assert.assertEquals(expected, withdrawal.getType());
    }

    @Test
    public void WithdrawalTransactionDateTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setTransaction_date("2017-07-25");
        String expected = "2017-07-25";
        Assert.assertEquals(expected, withdrawal.getTransaction_date());
    }

    @Test
    public void withdrawalStatusTest() {
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setStatus(Status.PENDING);
        Status expected = Status.PENDING;
        Assert.assertEquals(expected, withdrawal.getStatus());
    }

    @Test
    public void WithdrawalPayerIDTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setPayer_id(3);
        Integer expected = 3;
        Assert.assertEquals(expected, withdrawal.getPayer_id());
    }

    @Test
    public void WithdrawalMediumTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setMedium(Medium.REWARDS);
        Medium expected = Medium.REWARDS;
        Assert.assertEquals(expected, withdrawal.getMedium());
    }

    @Test
    public void WithdrawalAmountTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setAmount(100.0);
        Double expected = 100.0;
        Assert.assertEquals(expected, withdrawal.getAmount());
    }

    @Test
    public void WithdrawalDescriptionTest(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setDescription("ATM Withdrawal");
        String expected = "ATM Withdrawal";
        Assert.assertEquals(expected, withdrawal.getDescription());
    }
}
