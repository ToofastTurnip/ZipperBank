package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class BillService {

    private BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
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

    public void deleteBillByBillId(Integer id) {
        billRepository.delete(id);
    }
//    public Collection<Bill> findAllBillsByAccount(Integer id) {
//        Collection collection = new ArrayList();
//        Account account = new Account();
//
//        billRepository.findAll();
//        collection.add()
//        return collection;
//  }




}
