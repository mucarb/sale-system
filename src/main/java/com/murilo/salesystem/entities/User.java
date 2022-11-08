package com.murilo.salesystem.entities;

import java.io.Serializable;
import java.util.Objects;

import com.murilo.salesystem.entities.enums.UserType;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String username;
	private String password;
	private Integer userType;

	public User() {
		setUserType(UserType.ADMIN);
	}

	public User(Long id, String name, String username, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		setUserType(UserType.ADMIN);
	}

	public User(Long id, String name, String username, String password, UserType userType) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.userType = (userType == null) ? null : userType.getCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public UserType getUserType() {
		return UserType.toEnum(userType);
	}

	public void setUserType(UserType userType) {
		this.userType = userType.getCode();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
