package com.shareknowledge.image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shareknowledge.base.BaseProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "images")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImageEntity extends BaseProperty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;
	private String generatedName;
	private String originalName;
	@Column(length = 5)
	private String extention;
	private String imageLocation;

	public ImageEntity(Long imageId) {
		this.imageId = imageId;
	}

	public ImageEntity(String generatedName, String originalName, String extention, String imageLocation) {
		super();
		this.generatedName = generatedName;
		this.originalName = originalName;
		this.extention = extention;
		this.imageLocation = imageLocation;
	}

}
