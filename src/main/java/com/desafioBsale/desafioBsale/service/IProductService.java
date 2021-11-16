package com.desafioBsale.desafioBsale.service;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.model.Product;

import java.util.List;

public interface IProductService {

    public List<Product> readAll();
    public List<Product> readAllByCategory(int id);
    public List<Product> readByName(String name);
}
