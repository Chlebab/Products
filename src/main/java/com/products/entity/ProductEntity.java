package com.products.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId", nullable = false)
    private Integer productId;

    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "SupplierId")
    private SupplierEntity productSupplier;

    @ManyToMany
    @JoinTable(
            name = "ShopProduct",
            joinColumns = {@JoinColumn(name = "ProductId")},
            inverseJoinColumns = {@JoinColumn(name = "ShopId")}
    )
    private Set<ShopEntity> products;

    public ProductEntity() {}

    public ProductEntity(Set<ShopEntity> products) {
        this.products = products;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public SupplierEntity getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(SupplierEntity productSupplier) {
        this.productSupplier = productSupplier;
    }
}
