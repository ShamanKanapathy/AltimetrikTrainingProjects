package com.altimetrik.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SalesController {
    @GetMapping("/sale")
    public String getSales(){
        return "Sale is called";
    }

    @GetMapping("/sales")
    public String getAllSales() {
        return "AllSales is called";
    }
}
