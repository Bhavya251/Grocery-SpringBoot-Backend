package com.grocery.product.api.mapper;

import com.grocery.product.api.Product;
import com.grocery.product.api.dto.ProductCategoryDTO;
import com.grocery.product.api.external.Category;

public class ProductCategoryMapper {
    public static ProductCategoryDTO mapToProductCategoryDTO(Product product, Category category) {

        ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();

        productCategoryDTO.setProductID(product.getProductID());
        productCategoryDTO.setProductName(product.getProductName());
        productCategoryDTO.setProductDescription(product.getProductDescription());
        productCategoryDTO.setCategory(category);

        return productCategoryDTO;
    }
}
