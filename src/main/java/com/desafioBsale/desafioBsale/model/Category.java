package com.desafioBsale.desafioBsale.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // le indica a jpa que se trata de una entidad (tabla en la db)
@Table(name = "category") // se indica el nombre de la tabla que la entidad tiene en la db
@ToString // genera el toString
@NoArgsConstructor // genera constructor vacío
@AllArgsConstructor// genera constructor con parámetros
public class Category {

    @Id //indica que esta propiedad es una primary key en la db
    @Getter @Setter // genera getter y setter correspondientes
    private int id;

    @Column //indica que es un campo de la tabla en la db
    @Getter @Setter
    private String name;
}
