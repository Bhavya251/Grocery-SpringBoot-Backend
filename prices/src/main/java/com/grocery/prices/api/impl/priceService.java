package com.grocery.prices.api.impl;

import com.grocery.prices.api.Price;
import com.grocery.prices.api.dto.PriceDTO;

import java.util.List;

public interface priceService {
    List<PriceDTO> getGroceryList();
    void addGrocery(Price check);
//    Price getGroceryByName(String name);
//    boolean updateGrocery(String name, Price check);
}
