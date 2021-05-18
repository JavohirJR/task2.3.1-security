package com.javohir.task2.repository;

import com.javohir.task2.entity.District;
import com.javohir.task2.projection.CustomDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "district", collectionResourceRel = "list_info",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
