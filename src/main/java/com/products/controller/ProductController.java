package com.products.controller;

import com.products.entity.ProductEntity;
import com.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> allProducts() {
        List<ProductEntity> products = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable("id") Integer id) {
        ProductEntity productEntity =  productService.findById(id);
        if (productEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ProductEntity>(productEntity, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addNewProduct(@RequestBody ProductEntity productEntity) {
        productService.save(productEntity);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
