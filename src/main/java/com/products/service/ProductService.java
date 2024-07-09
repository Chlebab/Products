package com.products.service;

import com.products.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> findAll();
    ProductEntity findById(int id);
    void save(ProductEntity productEntity);
    void deleteById(int id);
}
