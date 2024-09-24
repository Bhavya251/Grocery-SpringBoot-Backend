package com.grocery.product.api.impl;


import com.grocery.product.api.Product;
import com.grocery.product.api.ProductRepository;
import com.grocery.product.api.clients.CategoryClient;
import com.grocery.product.api.dto.ProductCategoryDTO;
import com.grocery.product.api.external.Category;
import com.grocery.product.api.mapper.ProductCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class productImplementation implements productService {

    private ProductRepository productRepo;

    private CategoryClient categoryClient;

    public productImplementation(ProductRepository productRepo, CategoryClient categoryClient) {
        this.productRepo = productRepo;
        this.categoryClient = categoryClient;
    }

    @Override
    public List<ProductCategoryDTO> getProducts() {

        List<Product> products = productRepo.findAll();

        List<ProductCategoryDTO> productCategoryDTOS;
        productCategoryDTOS = products.stream().map(this::covertToDTO).collect(Collectors.toList());
        return productCategoryDTOS;
    }

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public ProductCategoryDTO getProduct(Long productID) {

        if (productRepo.findById(productID).isEmpty()) {
            return null;
        }
        Product product = productRepo.findById(productID).get();
        return covertToDTO(product);
    }

    private ProductCategoryDTO covertToDTO(Product product) {

        Category category = categoryClient.getCategory(product.getCategoryID());
        ProductCategoryDTO productCategoryDTO = ProductCategoryMapper.mapToProductCategoryDTO(product, category);
        productCategoryDTO.setCategory(category);

        return productCategoryDTO;
    }
}
