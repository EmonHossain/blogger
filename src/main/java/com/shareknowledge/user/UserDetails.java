package com.shareknowledge.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDetails {
    private String profession;
    private String description;
    private String quote;
}
