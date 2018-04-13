package io.zipcoder.bank.repository;

import io.zipcoder.bank.model.Withdrawal;
import io.zipcoder.core.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawalRepo extends BaseRepository<Withdrawal, Integer> {

}
