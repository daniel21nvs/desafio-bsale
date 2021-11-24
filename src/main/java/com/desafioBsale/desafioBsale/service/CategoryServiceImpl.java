package com.desafioBsale.desafioBsale.service;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.repo.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    ICategoryRepo categoryRepo;

    @Override
    /**
     * retorna una lista con todas las categorias
     */
    public List<Category> readAll() {
        return categoryRepo.findAll();
    }

    @Override
    /**
     * retorna un objeto de tipo categoria por su id
     */
    public Category readOne(int id) {
        return categoryRepo.findById(id).get();
    }

}
