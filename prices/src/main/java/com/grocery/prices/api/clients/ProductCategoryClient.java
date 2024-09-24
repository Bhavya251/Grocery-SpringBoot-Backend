package com.grocery.prices.api.clients;


import com.grocery.prices.api.external.ProductCategory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "products", url = "http://localhost:8093")
public interface ProductCategoryClient {

    @GetMapping("/product")
    public List<ProductCategory> getProducts();
}
