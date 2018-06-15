package com.user.entity;

import java.util.Date;

public class User {
	
	//用户id
	private Integer id;
	
	//名称
    private String name;
    
    private Integer age;
    
    private Date birthday;
    
    private String address;
    
    private Integer deleteFlag; //1正常 2删除

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", address=" + address
				+ ", deleteFlag=" + deleteFlag + "]";
	}

}
