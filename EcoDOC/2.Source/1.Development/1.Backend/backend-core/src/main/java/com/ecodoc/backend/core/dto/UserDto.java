package com.ecodoc.backend.core.dto;

import java.io.Serializable;

import com.ecodoc.backend.core.domain.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String userName;
	private String fullName;

	public UserDto(User user) {
		if (user == null) {
			return;
		}
		this.id = user.getId();
		this.fullName = user.getFullName();
		this.userName = user.getUserName();
	}

	public UserDto(String userName, String fullName) {
		this.userName = userName;
		if (this.userName != null) {
			this.userName = userName.trim();
		}
		this.fullName = fullName;
		if (this.fullName != null) {
			this.fullName = fullName.trim();
		}
	}

	public UserDto(Long id, String userName, String fullName) {
		this(userName, fullName);
		this.id = id;
	}
}
