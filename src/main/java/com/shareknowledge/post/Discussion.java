package com.shareknowledge.post;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Embeddable
@Data
public class Discussion {
	private String description;
}
