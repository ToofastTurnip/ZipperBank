package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BillService {

    private BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill findBillById(Integer id) {
        return billRepository.findOne(id);
    }
}
