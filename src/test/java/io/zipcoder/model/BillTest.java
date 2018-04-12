package io.zipcoder.model;

import io.zipcoder.bank.enums.Status;
import io.zipcoder.bank.model.Bill;
import org.junit.Assert;
import org.junit.Test;

public class BillTest {

    @Test
    public void billIdTest() {
        Bill bill = new Bill();
        bill.setId(1234);
        Integer expected = 1234;
        Assert.assertEquals(expected, bill.getId());
    }

    @Test
    public void billStatusTest() {
        Bill bill = new Bill();
        bill.setStatus(Status.PENDING);
        String expected = Status.PENDING.getValue();
        Assert.assertEquals(expected, bill.getStatus());
    }

    @Test
    public void billPayeeTest() {
        Bill bill = new Bill();
        bill.setPayee("Mitch");
        String expected = "Mitch";
        Assert.assertEquals(expected, bill.getPayee());
    }

    @Test
    public void billNicknameTest() {
        Bill bill = new Bill();
        bill.setNickname("College Fund");
        String expected = "College Fund";
        Assert.assertEquals(expected, bill.getNickname());
    }

    @Test
    public void billCreation_dateTest() {
        Bill bill = new Bill();
        bill.setCreation_date("12/10/2015");
        String expected = "12/10/2015";
        Assert.assertEquals(expected, bill.getCreation_date());
    }

    @Test
    public void billPayment_dateTest() {
        Bill bill = new Bill();
        bill.setPayment_date("12/10/2015");
        String expected = "12/10/2015";
        Assert.assertEquals(expected, bill.getPayment_date());
    }

    @Test
    public void billRecurring_dateTest() {
        Bill bill = new Bill();
        bill.setRecurring_date(30);
        Integer expected = 30;
        Assert.assertEquals(expected, bill.getRecurring_date());
    }

    @Test
    public void billUpcoming_payment_dateTest() {
        Bill bill = new Bill();
        bill.setUpcoming_payment_date("12/10/2015");
        String expected = "12/10/2015";
        Assert.assertEquals(expected, bill.getUpcoming_payment_date());
    }

    @Test
    public void billPayment_amountTest() {
        Bill bill = new Bill();
        bill.setPayment_amount(55.97);
        Double expected = 55.97;
        Assert.assertEquals(expected, bill.getPayment_amount());
    }

    @Test
    public void billAccount_idTest() {
        Bill bill = new Bill();
        bill.setAccount_id(1);
        Integer expected = 1;
        Assert.assertEquals(expected, bill.getAccount_id());
    }

}
