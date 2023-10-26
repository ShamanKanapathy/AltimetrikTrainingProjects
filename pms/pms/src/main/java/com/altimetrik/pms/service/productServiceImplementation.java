package com.altimetrik.pms.service;

import com.altimetrik.pms.entity.Product;
import com.altimetrik.pms.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class productServiceImplementation implements productService {
    @Autowired
    private ProductRepository productRepository;
    public void createProduct(Product product){
        System.out.println("SERVICE CLASS");
        productRepository.save(product);
    }
}
