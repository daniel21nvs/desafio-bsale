package com.desafioBsale.desafioBsale.service;

import com.desafioBsale.desafioBsale.model.Category;

import java.util.List;

public interface ICategoryService {

    public List<Category> readAll();
    public Category readOne(int id);
}
