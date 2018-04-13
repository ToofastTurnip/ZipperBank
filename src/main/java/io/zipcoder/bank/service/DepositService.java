package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Deposit;
import io.zipcoder.bank.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositService {

    private DepositRepository depositRepository;

    @Autowired
    public DepositService(DepositRepository depositRepository){
        this.depositRepository = depositRepository;
    }

    public Deposit createDeposit(Deposit deposit) {
        return depositRepository.save(deposit);
    }

    public Deposit findDepositByDepositId(Integer id) {
        return depositRepository.findOne(id);
    }

    public Deposit updateDepositByDepositId(Integer id, Deposit deposit) {
        deposit.setId(id);
        return depositRepository.save(deposit);
    }

    public void deleteDepositByDepositId(Integer id) {
        depositRepository.delete(id);
    }


    //Get all deposits for a specific account

}
