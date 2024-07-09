package com.products.dto;

public class ProductDTO {
    private Integer productId;
    private String name;
    private Integer price;
    private Integer supplierId;

    public ProductDTO() {
    }

    public ProductDTO(Integer productId, String name, Integer price, Integer supplierId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.supplierId = supplierId;
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplierId=" + supplierId +
                '}';
    }
}
