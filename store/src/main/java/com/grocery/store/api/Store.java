package com.grocery.store.api;

import jakarta.persistence.*;

@Entity
@Table(name = "master_store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeID;
    private String storeName;
    private String storeLocation;

    public Store(Long storeID, String storeName, String storeLocation) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    public Store() {
    }
    public Long getStoreID() {
        return storeID;
    }

    public void setStoreID(Long storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
