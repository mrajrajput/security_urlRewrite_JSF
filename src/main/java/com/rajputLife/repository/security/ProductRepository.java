package com.rajputLife.repository.security;

import com.rajputLife.entity.security.Product_Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product_Security, Long> {

}
