package com.grocery.prices.api.mapper;

import com.grocery.prices.api.Price;
import com.grocery.prices.api.dto.PriceDTO;
import com.grocery.prices.api.external.ProductCategory;
import com.grocery.prices.api.external.Store;

public class StoreProductCategoryMapper {

    public static PriceDTO mapToPriceDTO(Price price, Store store, ProductCategory productCategory) {

        PriceDTO priceDTO = new PriceDTO();

        priceDTO.setCheckID(price.getCheckID());
        priceDTO.setProductCategory(productCategory);
        priceDTO.setPrice(price.getPrice());
        priceDTO.setDateTime(price.getDateTime());
        priceDTO.setStore(store);

        return priceDTO;
    }
}
