package com.products.service;

import com.products.dao.ProductRepo;
import com.products.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ProductEntity> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity findById(int id) {
        Optional<ProductEntity> result = productRepo.findById(id);
        ProductEntity productEntity = null;
        if (result.isPresent()) {
            productEntity = result.get();
        } else {
            throw new RuntimeException("Did not find ProductEntity id: " + id);
        }
        return productEntity;
    }

    @Override
    public void save(ProductEntity productEntity) {
        productRepo.save(productEntity);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }
}
