package com.main.register.service;

import com.main.register.bean.UserRole;
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
public class UserRoleService {
	@Autowired
	public UserRoleRepository userRoleRepository;

	public List<UserRole> findAll() {
		List<UserRole> list = userRoleRepository.findAll();
		return list;
	}
}