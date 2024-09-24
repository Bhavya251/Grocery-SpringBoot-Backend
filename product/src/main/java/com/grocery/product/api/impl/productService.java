package com.grocery.product.api.impl;

import com.grocery.product.api.Product;
import com.grocery.product.api.dto.ProductCategoryDTO;

import java.util.List;

public interface productService {

    List<ProductCategoryDTO> getProducts();
    void addProduct(Product product);

    ProductCategoryDTO getProduct(Long productID);
}
