package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {this.accountRepository = accountRepository;}

    public Account createAccount(Account account) {return accountRepository.save(account);}

}
