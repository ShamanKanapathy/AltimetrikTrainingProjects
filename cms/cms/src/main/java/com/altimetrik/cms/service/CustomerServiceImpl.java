package com.altimetrik.cms.service;

import com.altimetrik.cms.entity.Customer;
import com.altimetrik.cms.repo.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;
@Service

public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public Customer createCustomer(Customer customer) {
        return iCustomerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return iCustomerRepo.findAll();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Optional<Customer> opt=iCustomerRepo.findById(customer.getCustomerId());
        if(opt.isPresent()){
            iCustomerRepo.save(customer);
        }
        return customer;
    }

    @DeleteMapping(path="/customer/{id}")
    public Optional<Customer> deleteCustomer(int customerId) {
        return iCustomerRepo.findById(customerId);
    }
}
