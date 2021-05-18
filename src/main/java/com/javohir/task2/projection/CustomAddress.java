package com.javohir.task2.projection;

import com.javohir.task2.entity.Address;
import com.javohir.task2.entity.District;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getHomeNumber();
    District getDistrict();
}
