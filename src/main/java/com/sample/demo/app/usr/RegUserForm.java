package com.sample.demo.app.usr;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegUserForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "半角英数字を入力してください。")
	@Size(min = 1, max = 20, message = "20文字以内で入力してください。")
	private String userId;
	
	@NotNull
	private String password;
	
	@Size(min = 1, max = 45)
	private String userName;
	
	@Email
	private String email;
	
	private String age;
	
	private String comment;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
}
