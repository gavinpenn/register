package com.main.register.repository;

import com.main.register.bean.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Integer>, JpaSpecificationExecutor<Resource> {
	@Query("from Resource where url=?1 ")
	List<Resource> getResourceByUrl(String requestUrl);
}
