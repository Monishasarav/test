package com.myapp.flipkart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.jpa.repository.JpaRepository;

//import jakarta.persistence.criteria.Order;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

@Query(value="select city,name from fkart_order inner join fkart_product on fkart_order.id=fkart_product.fkey_order",nativeQuery=true)
public List<Object> read();
}
