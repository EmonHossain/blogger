package com.shareknowledge.post;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Subtitle {
    private Long subtitleId;
    private String subtitle;
    @OneToMany(targetEntity = Discussion.class)
    private List<Discussion> discussions = new ArrayList<Discussion>();
    @OneToMany(targetEntity = Code.class)
    private List<Code> codes = new ArrayList<Code>();
    @OneToMany(targetEntity = Image.class)
    private List<Image> images = new ArrayList<Image>();

    public Subtitle(Long subtitleId) {
        this.subtitleId = subtitleId;
    }
}
