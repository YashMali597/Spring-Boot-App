package com.project.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.springbootapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
