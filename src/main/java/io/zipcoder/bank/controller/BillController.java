package io.zipcoder.bank.controller;

import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/bills")
public class BillController {

    private BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
        Bill savedBill = billService.createBill(bill);
        return new ResponseEntity<>(savedBill, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Bill>> findAllBills() {
        Collection<Bill> accounts = billService.findAllBills();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @RequestMapping(value = "/{billId}", method = RequestMethod.GET)
    public ResponseEntity<Bill> findBillById(@PathVariable("billId") Integer id) {
        Bill bill = billService.findBillByBillId(id);
        return new ResponseEntity<>(bill, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Bill> updateAccountById(@RequestBody Bill bill, @PathVariable("id") Integer id) {
        Bill returnBill = billService.updateBillByBillId(id, bill);
        return new ResponseEntity<>(returnBill, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBillById(@PathVariable("id") Integer id) {
        billService.deleteBillByBillId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @RequestMapping(value = "/accounts/{accountId}/bills", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Bill> createBill(@PathVariable("accountId") @RequestBody Bill bill) {
//        Bill savedBill = billService.createBill(bill);
//        return new ResponseEntity<>(savedBill, HttpStatus.CREATED);
//    }

}
