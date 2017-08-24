package com.shareknowledge.user;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Column(length = 50, nullable = false, unique = true)
	private String username;
	@Column(length = 25, nullable = false)
	private String firstName;
	@Column(length = 25, nullable = false)
	private String lastName;
	private String password;
	@Embedded
	private UserDetails userDetails;

	public UserEntity(String username, String firstName, String lastName, String password, UserDetails userDetails) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userDetails = userDetails;
	}

}
