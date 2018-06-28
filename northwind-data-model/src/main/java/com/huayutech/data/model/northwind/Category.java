package com.huayutech.data.model.northwind;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    Long id;

    @Column(name = "CategoryName", length = 15, unique = true, nullable = false)
    String name;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "Description", columnDefinition = "text")
    String description;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "Picture", columnDefinition = "blob")
    byte[] picture;
}
