package com.huayutech.data.model.northwind;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"CustomerName"})})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID")
    Long id;

    @Column(name = "CustomerName", length = 40, unique = true, nullable = false)
    String name;

    @Column(name = "ContactName", length = 30)
    String contactName;

    @Column(name = "ContactTitle", length = 30)
    String contactTitle;

    @Column(name = "Address", length = 80)
    String address;

    @Column(name = "City", length = 15)
    String city;

    @Column(name = "Region", length = 15)
    String region;

    @Column(name = "Postcode", length = 10)
    String postcode;

    @Column(name = "Country", length = 15)
    String country;

    @Column(name = "Phone", length = 24)
    String phone;

    @Column(name = "Fax", length = 24)
    String fax;

}
