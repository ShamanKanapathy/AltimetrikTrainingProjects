package com.altimetrik.cms.repo;
import com.altimetrik.cms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ICustomerRepo extends JpaRepository<Customer,Integer> {

}
