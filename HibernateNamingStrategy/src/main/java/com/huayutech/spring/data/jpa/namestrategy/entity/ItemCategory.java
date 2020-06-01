package com.huayutech.spring.data.jpa.namestrategy.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ItemCategory {

    @Id
    Long id;

    @Column
    String name;

}
