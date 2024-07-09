package com.products.service;

import com.products.entity.ShopEntity;

import java.util.List;

public interface ShopService {
    List<ShopEntity> findAll();
    ShopEntity findById(int id);
    void save(ShopEntity shopEntity);
    void deleteById(int id);
}
