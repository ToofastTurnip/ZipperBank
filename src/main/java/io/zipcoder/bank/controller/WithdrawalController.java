package io.zipcoder.bank.controller;

import io.zipcoder.bank.model.Deposit;
import io.zipcoder.bank.model.Withdrawal;
import io.zipcoder.bank.service.WithdrawalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/withdrawals")
public class WithdrawalController {

    private WithdrawalService withdrawalService;

    public WithdrawalController(WithdrawalService withdrawalService){
        this.withdrawalService = withdrawalService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Withdrawal> findAccountById(@PathVariable("id") Integer id) {
        Withdrawal withdrawal = withdrawalService.findWithdrawalByWithdrawalId(id);
        return new ResponseEntity<>(withdrawal, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Withdrawal> createAccount(@RequestBody Withdrawal withdrawal) {
        Withdrawal savedWithdrawal = withdrawalService.createWithdrawal(withdrawal);
        return new ResponseEntity<>(savedWithdrawal, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Withdrawal> updateAccountById(@RequestBody Withdrawal withdrawal, @PathVariable("id") Integer id) {
        Withdrawal returnWithdrawal = withdrawalService.updateWithdrawalByWithdrawalId(id, withdrawal);
        return new ResponseEntity<>(returnWithdrawal, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAccountByDepositId(@PathVariable("id") Integer id) {
        withdrawalService.deleteWithdrawalByWithdrawalId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Get all withdrawals for a specific account

}
