package com.desafioBsale.desafioBsale.repo;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByCategory_Id(int id);
    List<Product> findByNameContaining(String name);
}
