package io.zipcoder.bank.repository;

import io.zipcoder.bank.model.Account;
import io.zipcoder.core.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Integer> {
}
