package com.grocery.product.api.dto;

import com.grocery.product.api.Product;
import com.grocery.product.api.external.Category;

/**
 * DTO - Data Transfer Object
 */

public class ProductCategoryDTO {
    private Long productID;
    private String productName;
    private String productDescription;
    private Category category;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
