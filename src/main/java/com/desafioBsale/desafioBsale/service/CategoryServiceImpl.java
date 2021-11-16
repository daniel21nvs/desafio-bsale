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
    public List<Category> readAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category readOne(int id) {
        return categoryRepo.findById(id).get();
    }

}
