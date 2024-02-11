package com.sample.productmanagement.interfaces;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductVO {
    String id;
    String description;
    BigDecimal price;
}
