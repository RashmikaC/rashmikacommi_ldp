package com.example.spring_assignment.exception;

import com.example.spring_assignment.exception.CustomerErrorResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerErrorResponseTest {
    @Test
    public void testConstructor(){
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        assertNotNull(customerErrorResponse);
    }

    @Test
    public void testCustomerInitialization() {
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse(500, "Internal Server Error",10234);
        assertEquals(500, customerErrorResponse.getStatus());
        assertEquals("Internal Server Error", customerErrorResponse.getMessage());
        assertEquals(10234, customerErrorResponse.getTimeStamp());

    }

    @Test
    public void testStatus(){
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setStatus(500);
        assertEquals(500,customerErrorResponse.getStatus());
    }

    @Test
    public void testMessage(){
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setMessage("Internal Server Error");
        assertEquals("Internal Server Error",customerErrorResponse.getMessage());
    }

    @Test
    public void testTimeStamp(){
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setTimeStamp(10234);
        assertEquals(10234,customerErrorResponse.getTimeStamp());
    }

}
