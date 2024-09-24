package com.grocery.prices.api.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.grocery.prices.api.external.ProductCategory;
import com.grocery.prices.api.external.Store;

import java.sql.Timestamp;

/**
 * DTO - Data Transfer Object
 */


public class PriceDTO {
    private Long checkID;
    private ProductCategory productCategory;
    private Double price;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Timestamp dateTime;
    private Store store;

    public Long getCheckID() {
        return checkID;
    }

    public void setCheckID(Long checkID) {
        this.checkID = checkID;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
