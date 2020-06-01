package com.huayutech.spring.data.jpa.namestrategy.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"item_category_id","name"}))
public class Item {

    @Id
    Long itemId;

    @Column
    String name;

    @ManyToOne(optional = false)
    ItemCategory itemCategory;

}
