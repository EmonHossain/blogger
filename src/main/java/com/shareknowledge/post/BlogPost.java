package com.shareknowledge.post;

import com.shareknowledge.base.Base;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost extends Base{
    private Long postId;
    private String title;
    @OneToMany(targetEntity = Subtitle.class)
    private List<Subtitle> subtitles = new ArrayList<Subtitle>();

    public BlogPost(Long postId) {
        this.postId = postId;
    }
}
