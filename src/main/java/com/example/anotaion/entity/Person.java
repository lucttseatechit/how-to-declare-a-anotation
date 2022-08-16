package com.example.anotaion.entity;

import java.io.Serializable;

import com.example.anotaion.ConfirmPassword;
import com.example.anotaion.Eighteen;
@ConfirmPassword
public class Person implements Serializable{
	private String name;
	@Eighteen
	private Integer age;
	private String password;
	private String confirm;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
}
