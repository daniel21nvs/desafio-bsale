package com.desafioBsale.desafioBsale.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Getter @Setter
    private int id;

    @Column
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category")
    @Getter @Setter
    private Category category;
}
