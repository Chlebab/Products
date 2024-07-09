package com.products.service;

import com.products.dao.ShopRepo;
import com.products.entity.ShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepo shopRepo;

    @Override
    public List<ShopEntity> findAll() {
        return shopRepo.findAll();
    }

    @Override
    public ShopEntity findById(int id) {
        Optional<ShopEntity> result = shopRepo.findById(id);
        ShopEntity shopEntity = null;
        if (result.isPresent()) {
            shopEntity = result.get();
        } else {
            throw new RuntimeException("No shop with id: " + id);
        }
        return shopEntity;
    }

    @Override
    public void save(ShopEntity shopEntity) {
        shopRepo.save(shopEntity);
    }

    @Override
    public void deleteById(int id) {
        shopRepo.deleteById(id);
    }
}
