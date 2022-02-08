package com.exceptionly.tutorials.demo.service;

import com.exceptionly.tutorials.demo.model.Customer;

public interface CustomerService {
    Customer get(Long id);
    Customer delete(Long id);
    Customer save(Customer customer);

}
