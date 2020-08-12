package com.example.restapispringteste.repository;

import com.example.restapispringteste.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);


    
}