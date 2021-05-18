package com.javohir.task2.projection;

import com.javohir.task2.entity.Characteristics;
import com.javohir.task2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {
    Integer getId();
    String getName();
    Integer getSize();
    Product getProduct();
}
