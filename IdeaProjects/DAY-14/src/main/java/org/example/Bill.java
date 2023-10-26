package org.example;

import org.springframework.stereotype.Component;

@Component

public class Bill {
    public void payBill() {
        System.out.println("Bill payment");
    }
}
