package com.shareknowledge.user;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Embeddable
@Data
public class UserDetails {
    private String profession;
    private String description;
    private String quote;
}
