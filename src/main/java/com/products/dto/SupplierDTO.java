package com.products.dto;

public class SupplierDTO {
    private Integer supplierId;
    private String name;
    private String address;

    public SupplierDTO() {
    }

    public SupplierDTO(Integer supplierId, String name, String address) {
        this.supplierId = supplierId;
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "SupplierDTO{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
