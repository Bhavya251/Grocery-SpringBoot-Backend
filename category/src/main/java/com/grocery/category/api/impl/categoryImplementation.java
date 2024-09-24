package com.grocery.category.api.impl;


import com.grocery.category.api.Category;
import com.grocery.category.api.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryImplementation implements categoryService {

//    List<Category> categories = new ArrayList<>();

    CategoryRepository categoryRepo;

    public categoryImplementation(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }
}
