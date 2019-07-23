package com.main.register.bean;

import javax.persistence.*;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 09:51
 */
@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//角色名称(英文名)
	@Column
	private String role_name;

	//角色名称(中文名)
	@Column
	private String role_name_zh;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_name_zh() {
		return role_name_zh;
	}

	public void setRole_name_zh(String role_name_zh) {
		this.role_name_zh = role_name_zh;
	}
}