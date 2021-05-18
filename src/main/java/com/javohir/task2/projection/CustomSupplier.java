package com.javohir.task2.projection;

import com.javohir.task2.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getFullName();
    String getEmail();
    String getPhoneNumber();
    String getMessageBody();
}
