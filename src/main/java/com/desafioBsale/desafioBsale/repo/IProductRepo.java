package com.desafioBsale.desafioBsale.repo;

import com.desafioBsale.desafioBsale.model.Category;
import com.desafioBsale.desafioBsale.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
    /**
     *
     * @param id recibe el id de la categoria solicitada
     * @return lista de productos filtrada, cuya categoria
     * corresponda a la indicada como parámetro
     */
    List<Product> findByCategory_Id(int id);

    /**
     *
     * @param name recibe el nombre del producto solicitado
     * @return lista de productos cuyo nombre
     * coincida con el indicado en el parámetro name
     */
    List<Product> findByNameContaining(String name);
}
