package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {

	private int id;

	private static int count = 1;

	private String fullName;

	public Account() {
		this(1,"id");
		this.id = count++;
	}


	public Account(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", fullName='" + fullName + '\'' +
				'}';
	}
}
