package com.javohir.task2.projection;

import com.javohir.task2.entity.Address;
import com.javohir.task2.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFullName();

    String getEmail();

    Address getAddress();
}
