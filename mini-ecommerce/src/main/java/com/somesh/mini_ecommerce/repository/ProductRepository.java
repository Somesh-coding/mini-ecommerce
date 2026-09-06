package com.somesh.mini_ecommerce.repository;


import com.somesh.mini_ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}