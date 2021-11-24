package com.desafioBsale.desafioBsale.model;

import lombok.*;

import javax.persistence.*;

@Entity // le indica a jpa que se trata de una entidad (tabla en la db)
@Table(name = "product") // se indica el nombre de la tabla que la entidad tiene en la db
@NoArgsConstructor // genera constructor vacío
@AllArgsConstructor // genera constructor con parámetros
public class Product {
    @Id //indica que esta propiedad es una primary key en la db
    @Getter @Setter // genera getter y setter correspondientes
    private int id;

    @Column //indica que es un campo de la tabla en la db
    @Getter @Setter
    private String name;

    @Column
    @Getter @Setter
    private String url_image;

    @Column
    @Getter @Setter
    private float price;

    @Column
    @Getter @Setter
    private int discount;

    /**
     * ManyToOne indica la relación que existe entre esta entidad (Product) y
     * Category, la cual corresponde a una relación de Muchos a uno.
     * FetchType.EAGER indica que devolverá el objeto  category completo y
     * no sólo su referencia (fk)
     */
    @ManyToOne(fetch = FetchType.EAGER)
    // JoinColumn indica la columna de la tabla product que corresponde a la fk de category
    @JoinColumn(name = "category")
    @Getter @Setter
    private Category category;
}
