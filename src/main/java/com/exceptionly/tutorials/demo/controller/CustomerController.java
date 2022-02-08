package com.exceptionly.tutorials.demo.controller;

import com.exceptionly.tutorials.demo.model.Customer;
import com.exceptionly.tutorials.demo.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable final Long id) {
        return ResponseEntity.ok(customerService.get(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable final Long id) {
        return ResponseEntity.ok(customerService.delete(id));
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody final Customer customer) {
        return ResponseEntity.ok(customerService.save(customer));
    }
}
