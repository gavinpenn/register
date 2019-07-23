package com.main.register.bean;

import javax.persistence.*;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 09:51
 */
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//用户名
	@Column
	private String username;

	//密码
	@Column(name = "pwd")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}