package io.zipcoder.bank.repository;

import io.zipcoder.bank.model.Customer;
import io.zipcoder.core.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer,Integer>{

}
