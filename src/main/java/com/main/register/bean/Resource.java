package com.main.register.bean;

import javax.persistence.*;

/**
 * @program: register
 * @description:
 * @author: GavinPenn
 * @create: 2019-07-23 09:51
 */
@Entity
@Table(name = "resource")
public class Resource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	//网址
	@Column
	private String url;

	//资源名称
	@Column
	private String res_name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
}