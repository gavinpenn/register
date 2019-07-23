package com.main.register.repository;

import com.main.register.bean.RoleResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleResourceRepository extends JpaRepository<RoleResource,Integer>, JpaSpecificationExecutor<RoleResource> {
}
