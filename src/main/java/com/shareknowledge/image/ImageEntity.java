package com.shareknowledge.image;

import com.shareknowledge.base.Base;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Data
@Table(name = "images")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImageEntity extends Base{
    private Long imageId;
    private String imageLocation;

    public ImageEntity(Long imageId) {
        this.imageId = imageId;
    }
}
