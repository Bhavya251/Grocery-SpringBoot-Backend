package com.grocery.store.api.impl;

import com.grocery.store.api.Store;

import java.util.List;

public interface storeService {

    List<Store> getStores();
    void addStore(Store store);

    Store getStore(Long id);
}
