package com.grocery.product.api.clients;

import com.grocery.product.api.external.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category", url = "http://localhost:8094")
public interface CategoryClient {

    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable("id") Long categoryId);
}
