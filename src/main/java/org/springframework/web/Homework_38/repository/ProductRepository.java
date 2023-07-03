package org.springframework.web.Homework_38.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.Homework_38.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
