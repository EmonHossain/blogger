package com.shareknowledge.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Image {
    private Long imageId;
    private String imageLocation;

    public Image(Long imageId) {
        this.imageId = imageId;
    }
}
