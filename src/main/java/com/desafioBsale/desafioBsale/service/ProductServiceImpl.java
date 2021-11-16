package com.desafioBsale.desafioBsale.service;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.model.Product;
import com.desafioBsale.desafioBsale.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductRepo productRepo;

    @Override
    public List<Product> readAll() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> readAllByCategory(int id) {
        return productRepo.findByCategory_Id(id);
    }

    @Override
    public List<Product> readByName(String name) {
        return productRepo.findByNameContaining(name);
    }
}
