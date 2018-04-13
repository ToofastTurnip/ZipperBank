package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Withdrawal;
import io.zipcoder.bank.repository.WithdrawalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawalService {

    private WithdrawalRepo withdrawalRepo;

    @Autowired
    public WithdrawalService(WithdrawalRepo withdrawalRepo){
        this.withdrawalRepo = withdrawalRepo;
    }

    public Withdrawal createWithdrawal(Withdrawal withdrawal) {
        return withdrawalRepo.save(withdrawal);
    }

    public Withdrawal findWithdrawalByWithdrawalId(Integer id) {
        return withdrawalRepo.findOne(id);
    }

    public Withdrawal updateWithdrawalByWithdrawalId(Integer id, Withdrawal withdrawal) {
        withdrawal.setId(id);
        return withdrawalRepo.save(withdrawal);
    }

    public void deleteWithdrawalByWithdrawalId(Integer id) {
        withdrawalRepo.delete(id);
    }


    //Get all deposits for a specific account

}
