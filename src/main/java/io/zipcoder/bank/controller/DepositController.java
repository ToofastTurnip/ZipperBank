package io.zipcoder.bank.controller;

import io.zipcoder.bank.model.Deposit;
import io.zipcoder.bank.service.DepositService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class DepositController {

    private DepositService depositService;

    public DepositController(DepositService depositService){
        this.depositService = depositService;
    }

    @RequestMapping(value = "/deposits/{id}", method = RequestMethod.GET)
    public ResponseEntity<Deposit> findDepositByDepositId(@PathVariable("id") Integer id) {
        Deposit deposit = depositService.findDepositByDepositId(id);
        return new ResponseEntity<>(deposit, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Deposit> createDeposit(@RequestBody Deposit deposit) {
        Deposit savedDeposit = depositService.createDeposit(deposit);
        return new ResponseEntity<>(savedDeposit, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/deposits/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Deposit> updateDepositById(@RequestBody Deposit deposit, @PathVariable("id") Integer id) {
        Deposit returnDeposit = depositService.updateDepositByDepositId(id, deposit);
        return new ResponseEntity<>(returnDeposit, HttpStatus.OK);
    }

    @RequestMapping(value = "/deposits/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteDepositByDepositId(@PathVariable("id") Integer id) {
        depositService.deleteDepositByDepositId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Get all deposits for a specific account
}
