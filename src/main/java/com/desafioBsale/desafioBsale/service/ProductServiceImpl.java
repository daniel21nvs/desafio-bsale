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
    /**
     * retorna una lista con todos los productos
     */
    public List<Product> readAll() {
        return productRepo.findAll();
    }

    @Override
    /**
     * retorna una lista de productos filtrados por una categoría (id)
     */
    public List<Product> readAllByCategory(int id) {
        return productRepo.findByCategory_Id(id);
    }

    @Override
    /**
     * retorna una lista de productos filtrados por nombre
     */
    public List<Product> readByName(String name) {
        return productRepo.findByNameContaining(name);
    }
}
