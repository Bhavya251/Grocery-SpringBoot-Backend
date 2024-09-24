package com.grocery.store.api.impl;

import com.grocery.store.api.Store;
import com.grocery.store.api.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class storeImplementation implements storeService {

//    List<Store> stores = new ArrayList<>();

    StoreRepository storeRepo;

    public storeImplementation(StoreRepository storeRepo) {
        this.storeRepo = storeRepo;
    }


    @Override
    public List<Store> getStores() {
        return storeRepo.findAll();
    }

    @Override
    public void addStore(Store store) {
        storeRepo.save(store);
    }

    @Override
    public Store getStore(Long id) {
        return storeRepo.findById(id).orElse(null);
    }
}
