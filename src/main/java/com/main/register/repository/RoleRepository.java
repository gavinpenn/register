package com.main.register.repository;

import com.main.register.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 10:00
 */
public interface RoleRepository extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {

	//自定义sql语句并且开启本地sql
	//根据用户名查找该用户所有权限
	@Query(value = "select r.* from role r, user_role ur where ur.userid = ?1 and ur.rid = r.id", nativeQuery = true)
	List<Role> findRolesOfUser(String userid);

	//根据resource的主键查找resource允许的所有权限
	@Query(value = "select r.* from role r, role_resource rr where rr.resid = ?1 and rr.rid = r.id", nativeQuery =
																											  true)
	List<Role> findRolesOfResource(long resourceId);
}