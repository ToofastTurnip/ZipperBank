package io.zipcoder.bank.repository;

import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.model.Deposit;
import io.zipcoder.core.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends BaseRepository<Deposit, Integer> {
}
