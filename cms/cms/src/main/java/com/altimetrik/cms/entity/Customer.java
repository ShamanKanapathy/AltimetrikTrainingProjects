package com.altimetrik.cms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;
@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @NotNull
    private int customerId;

    private String customerName;

    private Date customerDob;

    private boolean isIndian;


}
