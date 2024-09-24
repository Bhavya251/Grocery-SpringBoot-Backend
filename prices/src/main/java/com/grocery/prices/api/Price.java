package com.grocery.prices.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "daily_price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checkID;
    private Long productID;
    private Double price;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Timestamp dateTime;
    private Long storeID;

    public Price(Long checkID, Long productID, Double price, Timestamp dateTime, Long storeID) {
        this.checkID = checkID;
        this.productID = productID;
        this.price = price;
        this.dateTime = dateTime;
        this.storeID = storeID;
    }

    public Price() {

    }

    public Long getCheckID() {
        return checkID;
    }

    public void setCheckID(Long checkID) {
        this.checkID = checkID;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
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

    public Long getStoreID() {
        return storeID;
    }

    public void setStoreID(Long storeID) {
        this.storeID = storeID;
    }
}
