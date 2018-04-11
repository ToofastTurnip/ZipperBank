package io.zipcoder.controller;

import io.zipcoder.bank.controller.AccountController;
import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.service.AccountService;
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
public class AccountControllerTest extends BaseControllerTest<Account> {

    @MockBean
    private AccountService accountService;

    @InjectMocks
    private AccountController accountController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(accountController).build();
        baseEndpointUrl = "/api/accounts";
        entity = new Account();
        initDependentVariables();
    }

    @Test
    public void testCreateAccount() throws Exception {
        when(accountService.createAccount(entity))
                .thenReturn(entity);
        mvcPerformPostWithNoPathVariables(baseEndpointUrl, entityAsJsonString);
    }

    @Test
    public void testFindAllAccounts() throws Exception {
        when(accountService.findAllAccounts())
                .thenReturn(entityCollection);
        returnedEntity = mvcPerformGetWithNoPathVariables(baseEndpointUrl);
        Assert.assertEquals(entityNotReturnedMessage, entityCollectionAsJsonString, returnedEntity);
    }

    @Test
    public void testFindAccountById() throws Exception {
        when(accountService.findAccountById(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformGetWithOnePathVariable(idEndpointUrl, childEntityId);
        Assert.assertEquals(entityNotReturnedMessage, entityAsJsonString, returnedEntity);
    }

    @Test
    public void testUpdateAccountById() throws Exception {
        when(accountService.updateAccountById(childEntityId, entity))
                .thenReturn(entity);
        mvcPerformUpdateWithOnePathVariable(idEndpointUrl, childEntityId, entityAsJsonString);
    }

    @Test
    public void testDeleteAccountById() throws Exception {
        when(accountService.findAccountById(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformDeleteWithOnePathVariable(idEndpointUrl, childEntityId);
    }

}
