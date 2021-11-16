package com.desafioBsale.desafioBsale.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @Getter @Setter
    private int id;

    @Column
    @Getter @Setter
    private String name;
}
