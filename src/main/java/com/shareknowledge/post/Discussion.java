package com.shareknowledge.post;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Discussion {
    private Long discussionId;
    private String description;

    public Discussion(Long discussionId) {
        this.discussionId = discussionId;
    }
}
