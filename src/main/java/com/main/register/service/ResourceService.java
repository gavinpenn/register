package com.main.register.service;

import com.main.register.bean.Resource;
import com.main.register.bean.Role;
import com.main.register.bean.RoleResource;
import com.main.register.repository.ResourceRepository;
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
public class ResourceService {
	@Autowired
	public ResourceRepository resourceRepository;

	@Autowired
	public RoleRepository roleRepository;

	public List<Resource> findAll() {
		List<Resource> list = resourceRepository.findAll();
		return list;
	}


	public Resource getResourceByUrl(String requestUrl) {
		List<Resource> list = resourceRepository.getResourceByUrl(requestUrl);
		if (null != list && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}


}