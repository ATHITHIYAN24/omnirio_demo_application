package com.omnirio.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omnirio.catalog.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
