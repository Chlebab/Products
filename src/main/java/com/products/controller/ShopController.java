package com.products.controller;

import com.products.entity.ShopEntity;
import com.products.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/shops")
    public ResponseEntity<List<ShopEntity>> allShops() {
        List<ShopEntity> shops = shopService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(shops);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopEntity> getShopById(@PathVariable("id") Integer id) {
        ShopEntity shopEntity = shopService.findById(id);
        if (shopEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ShopEntity>(shopEntity, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addNewShop(@RequestBody ShopEntity shopEntity) {
        shopService.save(shopEntity);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {
        shopService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
