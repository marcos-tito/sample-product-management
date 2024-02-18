package com.sample.productmanagement.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositoy extends MongoRepository<ProductDocument, String> {
}
