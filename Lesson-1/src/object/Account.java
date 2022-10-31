package object;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Account {

	int id;

	String email;

	String userName;

	String fullName;

	Department department;

	Position position;

	LocalDate createDate;

	Group[] groups;

	@Override
	public String toString() {
		return "object.Account{" +
				"id=" + id +
				", email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", fullName='" + fullName + '\'' +
				", department=" + department +
				", position=" + position +
				", createDate=" + createDate +
				", groups=" + Arrays.toString(groups) +
				'}';
	}

}
