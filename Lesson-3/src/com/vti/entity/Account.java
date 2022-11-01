package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {

	public int id;

	public String email;

	public String userName;

	public String fullName;

	public Department department;

	public Position position;

	public LocalDate createDate;

	Group[] groups;

//	@Override
//	public String toString() {
//		return "object.Account{" +
//				"id=" + id +
//				", email='" + email + '\'' +
//				", userName='" + userName + '\'' +
//				", fullName='" + fullName + '\'' +
//				", department=" + department +
//				", position=" + position +
//				", createDate=" + createDate +
//				", groups=" + Arrays.toString(groups) +
//				'}';
//	}


	@Override
	public String toString() {
		return "Account{" +
				"email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", fullName='" + fullName + '\'' +
				'}';
	}
}
