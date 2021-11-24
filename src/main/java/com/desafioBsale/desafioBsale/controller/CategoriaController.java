package com.desafioBsale.desafioBsale.controller;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** @CrossOrigin permite la comunicación entre el front y backend (API)
 *  a pesar de tener un origen distinto, evitando problemas de cors
 */
@RestController
@CrossOrigin(origins = "https://desafiobsale.web.app//", methods= {RequestMethod.GET})
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    CategoryServiceImpl categoryService;

    /**
     *  método encargado de retornar una lista de tipo Category con los
     *  nombres de las categorías existentes en la db
     *  este método no recibe parámetros
      */
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getCategories(){
        return categoryService.readAll();
    }
}
