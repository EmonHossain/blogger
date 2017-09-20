package com.shareknowledge.post;

import javax.persistence.*;

import com.shareknowledge.base.BaseProperty;

import com.shareknowledge.tag.TagEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Table(name = "posts")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPostEntity extends BaseProperty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postId;
	private String title;
	private String overview;
	@Embedded
	private Discussion discussion;
	@ManyToMany(mappedBy = "blogPostEntities")
	private Set<TagEntity> tagEntities = new HashSet<TagEntity>();
	public BlogPostEntity(Long postId) {
		this.postId = postId;
	}
}
