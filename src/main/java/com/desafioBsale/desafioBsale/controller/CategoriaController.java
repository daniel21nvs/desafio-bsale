package com.desafioBsale.desafioBsale.controller;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "https://bsale-desafio.herokuapp.com/", methods= {RequestMethod.GET})
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    CategoryServiceImpl categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getCategories(){
        return categoryService.readAll();
    }
}
