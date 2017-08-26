package com.shareknowledge.tag;

import com.shareknowledge.base.BaseProperty;
import com.shareknowledge.post.BlogPostEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Emon Hossain on 8/26/2017.
 */
@Entity
@Table(name = "tags")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TagEntity extends BaseProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tagId;
    private String tagName;
    @ManyToMany
    @JoinTable(name = "tags_posts", joinColumns = {@JoinColumn(name = "tagId", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "postId", nullable = false, updatable = false)})
    private Set<BlogPostEntity> blogPostEntities = new HashSet<BlogPostEntity>();

    public TagEntity(Integer tagId) {
        this.tagId = tagId;
    }
}
