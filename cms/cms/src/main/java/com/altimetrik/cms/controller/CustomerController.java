package com.altimetrik.cms.controller;

import com.altimetrik.cms.entity.Customer;
import com.altimetrik.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;


    @RequestMapping(path = "/customer", method = RequestMethod.POST)
    @ResponseBody
    public Customer createCustomer(@RequestBody Customer customer) {
        return iCustomerService.createCustomer(customer);
    }

    @RequestMapping(path = "/customers", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCustomer() {
        return iCustomerService.getAllCustomer();

    }

    @RequestMapping(path = "/customer", method = RequestMethod.PUT)
    @ResponseBody
    public Customer updateCustomer(@RequestBody Customer customer){
        return iCustomerService.updateCustomer(customer);




    }

}