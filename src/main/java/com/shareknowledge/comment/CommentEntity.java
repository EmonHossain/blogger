package com.shareknowledge.comment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.shareknowledge.base.BaseProperty;
import com.shareknowledge.post.BlogPostEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
@Entity
@Table(name = "comments")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentEntity extends BaseProperty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commentId;
	private String comment;
	@ManyToOne(optional = false)
	@JoinColumn(name = "postId")
	private BlogPostEntity post;
}
