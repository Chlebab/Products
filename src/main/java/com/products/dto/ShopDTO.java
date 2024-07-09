package com.products.dto;

public class ShopDTO {
    private Integer shopId;
    private String name;
    private String address;

    public ShopDTO() {
    }

    public ShopDTO(Integer shopId, String name, String address) {
        this.shopId = shopId;
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "ShopDTO{" +
                "shopId=" + shopId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
