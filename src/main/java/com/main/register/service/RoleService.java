package com.main.register.service;

import com.main.register.bean.Role;
import com.main.register.bean.UserRole;
import com.main.register.repository.RoleRepository;
import com.main.register.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 10:21
 */

@Service
public class RoleService {
	@Autowired
	public RoleRepository roleRepository;

	public List<Role> getRolesOfUser(String userid) {
		return roleRepository.findRolesOfUser(userid);
	}

	public List<Role> getRolesOfResource(long id) {
		return roleRepository.findRolesOfResource(id);
	}

	public List<Role> getRolesByResourceid(long resourceid) {
		List<Role> roles = roleRepository.findRolesOfResource(resourceid);
		return roles;
	}
}