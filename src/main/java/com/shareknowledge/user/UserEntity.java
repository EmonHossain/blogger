package com.shareknowledge.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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

    public UserEntity(int userId) {
        this.userId = userId;
    }

    public UserEntity(String username, String firstName, String lastName, String password, UserDetails userDetails) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userDetails = userDetails;
    }

}
