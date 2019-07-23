package com.main.register.service;

import com.main.register.bean.User;
import com.main.register.component.MyUserDetails;
import com.main.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 10:21
 */

@Service
public class UserService implements UserDetailsService {
	@Autowired
	public UserRepository userRepository;

	@Autowired
	public RoleService roleService;

	public List<User> findAll() {
		List<User> list = userRepository.findAll();
		return list;
	}

	public List<User> getByUsername(String name) {
		List<User> list = userRepository.getByUsername(name);
		return list;
	}

	@Override
	//重写UserDetailsService接口里面的抽象方法
	//根据用户名 返回一个UserDetails的实现类的实例
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		System.out.println("查找用户：" + s);
		User user = getByUsername(s).get(0);
		if (user == null) {
			throw new UsernameNotFoundException("没有该用户");
		}

		//查到User后将其封装为UserDetails的实现类的实例供程序调用
		//用该User和它对应的Role实体们构造UserDetails的实现类
		return new MyUserDetails(user, roleService.getRolesOfUser(user.getId()));
	}
}