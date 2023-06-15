package com.ep.properties.dao;

public class PropertiesDAO {
	private String url;
	private String userName;
	private String password;
	public PropertiesDAO(String url,String userName, String password) {
		this.password=password;
		this.url=url;
		this.userName=userName;
	}
	@Override
	public String toString() {
		return "PropertiesDAO [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
