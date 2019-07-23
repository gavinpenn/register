package com.main.register.bean;

import javax.persistence.*;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 09:51
 */
@Entity
@Table(name = "role_resource")
public class RoleResource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//角色主键
	@Column
	private String rid;

	//资源主键
	@Column
	private String resid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getResid() {
		return resid;
	}

	public void setResid(String resid) {
		this.resid = resid;
	}
}