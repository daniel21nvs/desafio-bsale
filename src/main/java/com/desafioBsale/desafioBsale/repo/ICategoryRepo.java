package com.desafioBsale.desafioBsale.repo;

import com.desafioBsale.desafioBsale.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepo extends JpaRepository<Category, Integer> {
}
