package com.products.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupplierId")
    private Integer supplierId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @OneToMany(mappedBy = "productSupplier")
    private Set<ProductEntity> supplierProducts;

    public SupplierEntity() {}

    public SupplierEntity(Set<ProductEntity> supplierProducts) {
        this.supplierProducts = supplierProducts;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
