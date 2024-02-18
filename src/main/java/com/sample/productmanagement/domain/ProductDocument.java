package com.sample.productmanagement.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class ProductDocument {

    @Id
    String id;
    String description;
    BigDecimal price;
}
