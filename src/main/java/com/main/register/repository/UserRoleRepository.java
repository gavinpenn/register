package com.main.register.repository;

import com.main.register.bean.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 10:00
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>, JpaSpecificationExecutor<UserRole> {
}