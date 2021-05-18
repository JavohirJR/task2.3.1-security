package com.javohir.task2.repository;

import com.javohir.task2.entity.Region;
import com.javohir.task2.projection.CustomRegion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "region", collectionResourceRel = "list_info",excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
