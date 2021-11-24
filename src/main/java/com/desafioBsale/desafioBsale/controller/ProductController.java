package com.desafioBsale.desafioBsale.controller;

import com.desafioBsale.desafioBsale.model.Product;
import com.desafioBsale.desafioBsale.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** @CrossOrigin permite la comunicación entre el front y backend (API)
 *  a pesar de tener un origen distinto, evitando problemas de cors
 */
@RestController
@CrossOrigin(origins = "https://desafiobsale.web.app/", methods= {RequestMethod.GET})
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    /**
     *  método encargado de retornar una lista de tipo Product con todas las
     *  propiedades (campos) de los productos existentes en la db
     *  este método no recibe parámetros
     */
    @GetMapping(value ="/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts(){
        return productService.readAll();
    }

    /**
     *  método encargado de retornar una lista de tipo Product con todas las
     *  propiedades (campos) de los productos existentes en la db
     *  filtrados por una categoría
     *  este método recibe como parámetro el id de la categoría solicitada
     */
    @GetMapping(value="/products", params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByCategory(@RequestParam("id") int id){

        return productService.readAllByCategory(id);
    }

    /**
     *  método encargado de retornar una lista de tipo Product con todas las
     *  propiedades (campos) de los productos existentes en la db
     *  cuyo name coincida con el name indicado como parámetro en la petición
     *  este método recibe como parámetro un name (nombre)
     */
    @GetMapping(value = "/products", params = "name", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByName(@RequestParam("name") String name){
        return productService.readByName(name);
    }

}
