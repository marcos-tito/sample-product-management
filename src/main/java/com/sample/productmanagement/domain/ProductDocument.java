package com.sample.productmanagement.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class ProductDocument {

    String id;
    String description;
    BigDecimal price;


}
