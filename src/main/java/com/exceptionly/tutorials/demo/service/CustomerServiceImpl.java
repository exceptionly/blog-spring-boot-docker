package com.exceptionly.tutorials.demo.service;

import com.exceptionly.tutorials.demo.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer get(Long id) {
        return new Customer(id, "Janis", "Joplin");
    }

    @Override
    public Customer delete(Long id) {
        return new Customer(id, "Chuck", "Norris");
    }

    @Override
    public Customer save(Customer customer) {
        return new Customer(1L, customer.getName(), customer.getSurname());
    }
}
