package io.zipcoder.controller;

import io.zipcoder.bank.controller.WithdrawalController;
import io.zipcoder.bank.model.Withdrawal;
import io.zipcoder.bank.service.WithdrawalService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import util.BaseControllerTest;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class WithdrawalControllerTest extends BaseControllerTest<Withdrawal> {

    @MockBean
    private WithdrawalService withdrawalService;

    @InjectMocks
    private WithdrawalController withdrawalController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(withdrawalController).build();
        baseEndpointUrl = "/api/withdrawals";
        entity = new Withdrawal();
        initDependentVariables();
    }

    @Test
    public void testCreateWithdrawal() throws Exception {
        when(withdrawalService.createWithdrawal(entity))
                .thenReturn(entity);
        mvcPerformPostWithNoPathVariables(baseEndpointUrl, entityAsJsonString);
        System.out.println(entityAsJsonString);
    }

//    @Test
//    public void testFindAllAccounts() throws Exception {
//        when(accountService.findAllAccounts())
//                .thenReturn(entityCollection);
//        returnedEntity = mvcPerformGetWithNoPathVariables(baseEndpointUrl);
//        Assert.assertEquals(entityNotReturnedMessage, entityCollectionAsJsonString, returnedEntity);
//        System.out.println(returnedEntity);
//    }

    @Test
    public void testFindWithdrawalById() throws Exception {
        when(withdrawalService.findWithdrawalByWithdrawalId(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformGetWithOnePathVariable(idEndpointUrl, childEntityId);
        Assert.assertEquals(entityNotReturnedMessage, entityAsJsonString, returnedEntity);
    }

    @Test
    public void testUpdateWithdrawalById() throws Exception {
        when(withdrawalService.updateWithdrawalByWithdrawalId(childEntityId, entity))
                .thenReturn(entity);
        mvcPerformUpdateWithOnePathVariable(idEndpointUrl, childEntityId, entityAsJsonString);
    }

    @Test
    public void testDeleteAccountById() throws Exception {
        when(withdrawalService.findWithdrawalByWithdrawalId(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformDeleteWithOnePathVariable(idEndpointUrl, childEntityId);
    }
}
