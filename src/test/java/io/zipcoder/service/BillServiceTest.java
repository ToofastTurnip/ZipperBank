package io.zipcoder.service;

import io.zipcoder.bank.model.Bill;
import io.zipcoder.bank.repository.BillRepository;
import io.zipcoder.bank.service.BillService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import util.BaseServiceTest;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BillServiceTest extends BaseServiceTest<Bill> {

//    @Mock
//    private static BillRepository billRepository;
//
//    @InjectMocks
//    private static BillService billService = new BillService(billRepository);
//
//    @Before
//    public void init() {
//        entity = new Bill();
//        initDependentVariables();
//    }
//
//    @Test
//    public void testCreateBill() {
//        when(billRepository.save(entity))
//                .thenReturn(entity);
//        returnedEntity = billService.createBill(entity);
//        Assert.assertEquals(entityNotReturnedMessage, entity, returnedEntity);
//    }
//
//    @Test
//    public void testFindAccountById() {
//        when(billRepository.findOne(entityId))
//                .thenReturn(entity);
//        returnedEntity = billService.findBillByBillId(entityId);
//        Assert.assertEquals(entityNotReturnedMessage, entity, returnedEntity);
//    }
//
//    // More tests coming when BillService() is done

}
