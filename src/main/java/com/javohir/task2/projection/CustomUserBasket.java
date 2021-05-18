package com.javohir.task2.projection;

import com.javohir.task2.entity.User;
import com.javohir.task2.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = UserBasket.class)
public interface CustomUserBasket {

    Integer getId();
    Double getAllSum();
    User getUser();
}
