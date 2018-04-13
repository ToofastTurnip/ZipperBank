package io.zipcoder.controller;

import io.zipcoder.bank.controller.DepositController;
import io.zipcoder.bank.model.Deposit;
import io.zipcoder.bank.service.DepositService;
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
public class DepositControllerTest extends BaseControllerTest<Deposit> {

    @MockBean
    private DepositService depositService;

    @InjectMocks
    private DepositController depositController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(depositController).build();
        baseEndpointUrl = "/deposits";
        entity = new Deposit();
        initDependentVariables();
    }

    @Test
    public void testCreateDeposit() throws Exception {
        when(depositService.createDeposit(entity))
                .thenReturn(entity);
        mvcPerformPostWithNoPathVariables(baseEndpointUrl, entityAsJsonString);
        System.out.println(entityAsJsonString);
    }

    @Test
    public void testFindDepositById() throws Exception {
        when(depositService.findDepositByDepositId(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformGetWithOnePathVariable(idEndpointUrl, childEntityId);
        Assert.assertEquals(entityNotReturnedMessage, entityAsJsonString, returnedEntity);
    }

    @Test
    public void testUpdateDepositById() throws Exception {
        when(depositService.updateDepositByDepositId(childEntityId, entity))
                .thenReturn(entity);
        mvcPerformUpdateWithOnePathVariable(idEndpointUrl, childEntityId, entityAsJsonString);
    }

    @Test
    public void testDeleteDepositById() throws Exception {
        when(depositService.findDepositByDepositId(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformDeleteWithOnePathVariable(idEndpointUrl, childEntityId);
    }

}
