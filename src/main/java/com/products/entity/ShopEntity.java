package com.products.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "shop")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShopId", nullable = false)
    private Integer shopId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @ManyToMany(mappedBy = "products")
    private Set<ProductEntity> myProducts;

    public ShopEntity() {}

    public ShopEntity(Set<ProductEntity> myProducts) {
        this.myProducts = myProducts;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
