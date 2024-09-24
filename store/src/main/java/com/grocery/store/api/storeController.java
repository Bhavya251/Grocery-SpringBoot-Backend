package com.grocery.store.api;


import com.grocery.store.api.impl.storeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 GET /category: Get whole list of categories
 POST /category: Create a new category (request body should contain the all details)
 */


@RestController
@RequestMapping("/store")
public class storeController {

    @Autowired
    private storeService storeService;


    @GetMapping
    public ResponseEntity<List<Store>> getStores() {
        return new ResponseEntity<>(storeService.getStores(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Store> getStore(@PathVariable Long id) {
        return new ResponseEntity<>(storeService.getStore(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addStore(@RequestBody Store store) {
        storeService.addStore(store);
        return new ResponseEntity<>("New Store Added !", HttpStatus.CREATED);
    }
}
