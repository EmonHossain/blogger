package com.shareknowledge.user;

import javax.persistence.Embeddable;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Embeddable
public class UserDetails {
    private String profession;
    private String description;
    private String quote;
}
