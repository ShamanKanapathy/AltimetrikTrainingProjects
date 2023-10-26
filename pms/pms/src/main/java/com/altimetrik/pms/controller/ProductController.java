package com.altimetrik.pms.controller;

import com.altimetrik.pms.entity.Product;
import com.altimetrik.pms.service.productService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ProductController {
    @Autowired
    private productService productservice;

    @ResponseBody
    @RequestMapping(path="/product",method= RequestMethod.POST)

    public void createProduct(@RequestBody Product product){
        System.out.println(product.getProductId());
        System.out.println(product.getProductCost());
        System.out.println(product.getProductName());
    }
}
