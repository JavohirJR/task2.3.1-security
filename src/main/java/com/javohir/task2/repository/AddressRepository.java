package com.javohir.task2.repository;

import com.javohir.task2.entity.Address;
import com.javohir.task2.projection.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "address", collectionResourceRel = "list_info",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {


}
