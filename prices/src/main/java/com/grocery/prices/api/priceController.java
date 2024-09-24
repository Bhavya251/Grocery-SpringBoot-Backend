package com.grocery.prices.api;

import com.grocery.prices.api.dto.PriceDTO;
import com.grocery.prices.api.impl.priceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 GET /grocery: Get whole list of dailyCheck
 GET /grocery/{name}: Get a specific item by name
 POST /grocery: Create a new entry (request body should contain the all details)
 PUT /grocery/{name}: Update a specific item by name (request body should contain the updated values)
 */

@RestController
@RequestMapping("/grocery")
public class priceController {

    @Autowired
    private priceService priceService;

    @GetMapping
    public ResponseEntity<List<PriceDTO>> getGroceryList() {
        return new ResponseEntity<>(priceService.getGroceryList(), HttpStatus.OK);
    }

//    @GetMapping("/{name}")
//    public ResponseEntity<Price> getGroceryByName(@PathVariable String name) {
//        Price check = priceService.getGroceryByName(name);
//
//        if (check == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(check, HttpStatus.OK);
//    }

    @PostMapping("/addItem")
    public ResponseEntity<String> addGrocery(@RequestBody Price price) {
        price.setDateTime(Timestamp.valueOf(LocalDateTime.now()));

        priceService.addGrocery(price);

        return new ResponseEntity<>("New Item Check Added !", HttpStatus.CREATED);
    }

//    @PutMapping("/{name}")
//    public ResponseEntity<String> updateGrocery(@PathVariable String name, @RequestBody Price check) {
//        String caseName = name.toLowerCase();
//        check.setDateTime(Timestamp.valueOf(LocalDateTime.now()));
//        if (priceService.getGroceryByName(name) != null) {
//            boolean result = priceService.updateGrocery(name, check);
//            if (result){
//                return new ResponseEntity<>("Item Updated !", HttpStatus.OK);
//            }
//            return new ResponseEntity<>("Item Updated failed !", HttpStatus.NOT_ACCEPTABLE);
//        } else {
//            return new ResponseEntity<>("Item Not Found !", HttpStatus.NOT_FOUND);
//        }
//    }
}
