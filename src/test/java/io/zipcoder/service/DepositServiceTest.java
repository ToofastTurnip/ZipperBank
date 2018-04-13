package io.zipcoder.service;

import io.zipcoder.bank.model.Deposit;
import io.zipcoder.bank.repository.DepositRepository;
import io.zipcoder.bank.service.DepositService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import util.BaseServiceTest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DepositServiceTest extends BaseServiceTest<Deposit> {

    @Mock
    private static DepositRepository depositRepository;

    @InjectMocks
    private static DepositService depositService;

    @Before
    public void init() {
        entity = new Deposit();
        initDependentVariables();
    }

    @Test
    public void testCreateCustomer() {
        when(depositRepository.save(entity))
                .thenReturn(entity);
        returnedEntity = depositService.createDeposit(entity);
        Assert.assertEquals(entityNotReturnedMessage, entity, returnedEntity);
    }

    @Test
    public void testFindCustomerById() {
        when(depositRepository.findOne(entityId))
                .thenReturn(entity);
        returnedEntity = depositService.findDepositByDepositId(entityId);
        Assert.assertEquals(entityNotReturnedMessage, entity, returnedEntity);
    }

    @Test
    public void testUpdateCustomerById() {
        when(depositRepository.save(entity))
                .thenReturn(entity);
        returnedEntity = depositService.updateDepositByDepositId(entityId, entity);
        Assert.assertEquals(entityNotReturnedMessage, entity, returnedEntity);
    }

    @Test
    public void testDeleteCustomerById() {
        depositService.deleteDepositByDepositId(entityId);
        verify(depositRepository).delete(entityId);
    }

}
