package com.javohir.task2.repository;

import com.javohir.task2.entity.OutputProduct;
import com.javohir.task2.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list_info",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
