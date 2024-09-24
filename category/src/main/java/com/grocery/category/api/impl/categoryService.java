package com.grocery.category.api.impl;

import com.grocery.category.api.Category;

import java.util.List;

public interface categoryService {

    List<Category> getCategories();

    void addCategory(Category category);

    Category getCategory(Long id);
}
