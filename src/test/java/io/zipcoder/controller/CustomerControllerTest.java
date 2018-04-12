package io.zipcoder.controller;

import io.zipcoder.bank.controller.CustomerController;
import io.zipcoder.bank.model.Customer;
import io.zipcoder.bank.service.CustomerService;
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
public class CustomerControllerTest extends BaseControllerTest<Customer> {

    @MockBean
    private CustomerService customerService;

    @InjectMocks
    private CustomerController customerController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(customerController).build();
        baseEndpointUrl = "/api/customers";
        entity = new Customer();
        initDependentVariables();
    }

    @Test
    public void testCreateCustomer() throws Exception {
        when(customerService.createCustomer(entity))
                .thenReturn(entity);
        mvcPerformPostWithNoPathVariables(baseEndpointUrl, entityAsJsonString);
        System.out.println(entityAsJsonString);
    }

    @Test
    public void testFindAllCustomers() throws Exception {
        when(customerService.findAllCustomers())
                .thenReturn(entityCollection);
        returnedEntity = mvcPerformGetWithNoPathVariables(baseEndpointUrl);
        Assert.assertEquals(entityNotReturnedMessage, entityCollectionAsJsonString, returnedEntity);
        System.out.println(returnedEntity);
    }

    @Test
    public void testFindCustomerById() throws Exception {
        when(customerService.findCustomerById(childEntityId))
                .thenReturn(entity);
        returnedEntity = mvcPerformGetWithOnePathVariable(idEndpointUrl, childEntityId);
        Assert.assertEquals(entityNotReturnedMessage, entityAsJsonString, returnedEntity);
    }

    @Test
    public void testUpdateCustomerById() throws Exception {
        when(customerService.updateCustomerById(childEntityId, entity))
                .thenReturn(entity);
        mvcPerformUpdateWithOnePathVariable(idEndpointUrl, childEntityId, entityAsJsonString);
    }

    // No ability to remove customer yet, un-note this test if that is added
//    @Test
//    public void testDeleteCustomerById() throws Exception {
//        when(customerService.findCustomerById(childEntityId))
//                .thenReturn(entity);
//        returnedEntity = mvcPerformDeleteWithOnePathVariable(idEndpointUrl, childEntityId);
//    }

}
