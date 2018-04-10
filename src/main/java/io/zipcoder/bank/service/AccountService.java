package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {this.accountRepository = accountRepository;}

    public Account createAccount(Account account) {return accountRepository.save(account);}

    public Collection<Account> findAllStudents() {
        return accountRepository.findAll();
    }

    public Account findAccountById(int id) {
        return accountRepository.findOne(id);
    }

    public Account updateAccountById(Long id, Account account) {
        account.setId(id);
        return accountRepository.save(account);
    }

    public void deleteAccountById(int id) {
        accountRepository.delete(id);
    }

}
