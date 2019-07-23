package com.main.register.bean;

import javax.persistence.*;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 09:51
 */
@Entity
@Table(name = "user_role")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	//用户主键
	@Column
	private String userid;

	//资源主键
	@Column
	private String rid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}
}