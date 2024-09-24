package com.grocery.product.api;

import com.grocery.product.api.dto.ProductCategoryDTO;
import com.grocery.product.api.impl.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    private productService productService;

    @GetMapping
    public ResponseEntity<List<ProductCategoryDTO>> getProducts() {
        if(productService.getProducts() == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{productID}")
    public ResponseEntity<ProductCategoryDTO> getProduct(@PathVariable("productID") Long productID) {
        if(productService.getProduct(productID) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productService.getProduct(productID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return new ResponseEntity<>("New Product Added !", HttpStatus.CREATED);
    }
}
