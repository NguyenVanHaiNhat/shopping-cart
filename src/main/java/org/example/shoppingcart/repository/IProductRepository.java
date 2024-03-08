package org.example.shoppingcart.repository;

import org.example.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
