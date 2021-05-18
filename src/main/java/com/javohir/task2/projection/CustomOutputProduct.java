package com.javohir.task2.projection;

import com.javohir.task2.entity.OutputProduct;
import com.javohir.task2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Set<Product> getProduct();
    Integer getAmount();
}
