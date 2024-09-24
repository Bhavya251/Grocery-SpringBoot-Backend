package com.grocery.category.api;

import com.grocery.category.api.impl.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 GET /category: Get whole list of categories
 POST /category: Create a new category (request body should contain the all details)
 */

@RestController
@RequestMapping("/category")
public class categoryController {

    @Autowired
    private  categoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getCategories(){
        return new ResponseEntity<>(categoryService.getCategories(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Long id){
        return new ResponseEntity<>(categoryService.getCategory(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        return new ResponseEntity<>("New Category Added !", HttpStatus.CREATED);
    }
}
