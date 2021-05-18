package com.javohir.task2.repository;

import com.javohir.task2.entity.User;
import com.javohir.task2.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list_info",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
