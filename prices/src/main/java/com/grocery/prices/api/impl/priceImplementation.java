package com.grocery.prices.api.impl;

import com.grocery.prices.api.Price;
import com.grocery.prices.api.PriceRepository;
import com.grocery.prices.api.clients.ProductCategoryClient;
import com.grocery.prices.api.clients.StoreClient;
import com.grocery.prices.api.dto.PriceDTO;
import com.grocery.prices.api.external.ProductCategory;
import com.grocery.prices.api.external.Store;
import com.grocery.prices.api.mapper.StoreProductCategoryMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class priceImplementation implements priceService {
    private PriceRepository priceRepo;

    private StoreClient storeClient;

    private ProductCategoryClient productCategoryClient;

    List<ProductCategory> productCategories;

    public priceImplementation(PriceRepository priceRepo, StoreClient storeClient, ProductCategoryClient productCategoryClient) {
        this.priceRepo = priceRepo;
        this.storeClient = storeClient;
        this.productCategoryClient = productCategoryClient;

        getProducts();
    }

    private void getProducts() {
        productCategories = productCategoryClient.getProducts();
    }


    @Override
    public List<PriceDTO> getGroceryList() {

        List<Price> priceList = priceRepo.findAll();

        List<PriceDTO> priceDTOS;
        priceDTOS = priceList.stream().map(this::convertToDTO).collect(Collectors.toList());
        return priceDTOS;
    }

    @Override
    public void addGrocery(Price price) {
        priceRepo.save(price);
    }

//    @Override
//    public Price getGroceryByName(String name) {
//
//        for (Price check : prices) {
//            if (check.getName().equals(name)) {
//                return check;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean updateGrocery(String name, Price check) {
//
//        for (Price i : prices) {
//            if (i.getName().equals(name)) {
//                i.setProductID(check.getProductID());
//                i.setPrice(check.getPrice());
//                i.setDateTime(check.getDateTime());
//                i.setStoreID(check.getStoreID());
//
//                return true;
//            }
//        }
//
//        return false;
//    }


    private PriceDTO convertToDTO(Price price) {
        ProductCategory productCategory = findProductCategory(price.getProductID());
        if (productCategory == null) {
            return null;
        }
        Store store = storeClient.getStore(price.getStoreID());
        PriceDTO priceDTO = StoreProductCategoryMapper.mapToPriceDTO(price, store, productCategory);
        priceDTO.setProductCategory(productCategory);
        priceDTO.setStore(store);

        return priceDTO;
    }

    private ProductCategory findProductCategory(Long productID) {
        for (ProductCategory productCategory : productCategories) {
            if (productCategory.getProductID() == productID) {
                return productCategory;
            }
        }
        return null;
    }

}
