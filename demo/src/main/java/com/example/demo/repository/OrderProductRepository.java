package com.example.demo.repository;

import com.example.demo.model.OrderProduct;
import com.example.demo.model.OrderProductPK;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderProductRepository extends MongoRepository<OrderProduct, OrderProductPK> {
}
