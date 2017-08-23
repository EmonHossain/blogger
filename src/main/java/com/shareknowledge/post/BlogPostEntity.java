package com.shareknowledge.post;

import com.shareknowledge.base.Base;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPostEntity extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String title;
    private String overview;
    @Embedded
    private Discussion discussion;

    public BlogPostEntity(Long postId) {
        this.postId = postId;
    }
}
