package com.javohir.task2.projection;

import com.javohir.task2.entity.Order;
import com.javohir.task2.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    String getDate();
    UserBasket getUserBasket();
    String getDetails();
}
