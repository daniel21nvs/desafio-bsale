package com.desafioBsale.desafioBsale.controller;

import com.desafioBsale.desafioBsale.model.Product;
import com.desafioBsale.desafioBsale.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://bsale-desafio.herokuapp.com/", methods= {RequestMethod.GET})
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;


    @GetMapping(value ="/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts(){
        return productService.readAll();
    }

    @GetMapping(value="/products", params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByCategory(@RequestParam("id") int id){

        return productService.readAllByCategory(id);
    }

    @GetMapping(value = "/products", params = "name", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByName(@RequestParam("name") String name){
        return productService.readByName(name);
    }

}
