package com.shareknowledge.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import com.shareknowledge.post.BlogPostEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
@Entity
@Table(name = "commets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commentId;
	private String comment;
	@ManyToOne(optional = false)
	@JoinColumn(name = "postId")
	private BlogPostEntity blogPostEntity;
}
