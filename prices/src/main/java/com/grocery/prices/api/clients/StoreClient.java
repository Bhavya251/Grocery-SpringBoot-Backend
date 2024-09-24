package com.grocery.prices.api.clients;


import com.grocery.prices.api.external.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "store", url = "http://localhost:8095")
public interface StoreClient {

    @GetMapping("/store/{id}")
    public Store getStore(@PathVariable("id") Long storeId);
}
