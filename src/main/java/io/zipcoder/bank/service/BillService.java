package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.repository.AccountRepository;
import io.zipcoder.bank.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Collection;

public class BillService {

    private BillRepository billRepository;
    private AccountService accountService;

    @Autowired
    public BillService(BillRepository billRepository, AccountService accountService) {
        this.billRepository = billRepository;
        this.accountService = accountService;
    }

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill findBillByBillId(Integer id) {
        return billRepository.findOne(id);
    }

    public Bill updateBillByBillId(Integer id, Bill bill) {
        bill.setId(id);
        return billRepository.save(bill);
    }

    public Collection<Bill> findAllBills() {
        return (Collection<Bill>) billRepository.findAll();
    }

    public void deleteBillByBillId(Integer id) {
        billRepository.delete(id);
    }


    public Collection<Bill> findAllBillsByAccount(Integer id) {
        Collection collection = new ArrayList();
        ArrayList<Account> accounts = (ArrayList<Account>) accountService.findAllAccounts();
        ArrayList<Bill> bills = (ArrayList<Bill>) this.findAllBills();
        for (Account account : accounts) {
            if (id.equals(account.getId())) {
                for (Bill bill : bills) {
                    if (bill.getAccount_id().equals(id)) {
                        collection.add(bill);
                    }
                }
            }
        }
        return collection;
    }

}
