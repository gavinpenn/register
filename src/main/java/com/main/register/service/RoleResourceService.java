package com.main.register.service;

import com.main.register.bean.Role;
import com.main.register.bean.RoleResource;
import com.main.register.repository.RoleRepository;
import com.main.register.repository.RoleResourceRepository;
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
public class RoleResourceService {
	@Autowired
	public RoleResourceRepository roleResourceRepository;

	public List<RoleResource> findAll() {
		List<RoleResource> list = roleResourceRepository.findAll();
		return list;
	}
}