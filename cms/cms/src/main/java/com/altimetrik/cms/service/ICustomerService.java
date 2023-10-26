package com.altimetrik.cms.service;

import com.altimetrik.cms.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public Customer createCustomer(Customer customer);

    public List<Customer> getAllCustomer();

    public Customer getCustomerById(int customerId);

    public Customer updateCustomer(Customer customer);


    public Optional <Customer> deleteCustomer(int customerId);


}
