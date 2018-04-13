package io.zipcoder.model;

import io.zipcoder.bank.enums.Medium;
import io.zipcoder.bank.enums.Status;
import io.zipcoder.bank.enums.Type;
import io.zipcoder.bank.model.Deposit;
import org.junit.Assert;
import org.junit.Test;

public class DepositTest {

    @Test
    public void depositIdTest() {
        Deposit deposit = new Deposit();
        deposit.setId(1);
        Integer expected = 1;
        Integer actual = deposit.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositTypeTest() {
        Deposit deposit = new Deposit();
        Type type = Type.CHECKING;
        deposit.setType(type);
        Type expected = Type.CHECKING;
        Type actual = deposit.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositTransactionDateTest() {
        Deposit deposit = new Deposit();
        deposit.setTransaction_date("today");
        String expected = "today";
        String actual = deposit.getTransaction_date();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositStatusTest() {
        Deposit deposit = new Deposit();
        Status status = Status.PENDING;
        deposit.setStatus(status);
        Status expected = Status.PENDING;
        Status actual = deposit.getStatus();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositPayeeIdTest() {
        Deposit deposit = new Deposit();
        deposit.setPayee_id(1);
        Integer expected = 1;
        Integer actual = deposit.getPayee_id();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositMediumTest() {
        Deposit deposit = new Deposit();
        Medium medium = Medium.BALANCE;
        deposit.setMedium(medium);
        Medium expected = Medium.BALANCE;
        Medium actual = deposit.getMedium();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositAmountTest() {
        Deposit deposit = new Deposit();
        deposit.setAmount(1.0);
        Double expected = 1.0;
        Double actual = deposit.getAmount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositDescriptionTest() {
        Deposit deposit = new Deposit();
        deposit.setDescription("uh");
        String expected = "uh";
        String actual = deposit.getDescription();
        Assert.assertEquals(expected, actual);
    }

}
