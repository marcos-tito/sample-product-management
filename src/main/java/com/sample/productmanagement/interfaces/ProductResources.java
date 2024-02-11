package com.sample.productmanagement.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResources {

    @PostMapping
    public ResponseEntity<ProductVO> addProduct(@RequestBody ProductVO productVO) {

        return ResponseEntity.ok(productVO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductVO> findProduct(@RequestParam("id") String productId) {

        return ResponseEntity.ok().build();
    }
}
