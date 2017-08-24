package com.shareknowledge.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.shareknowledge.base.Base;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
@Entity
@Table(name = "replies")
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;
    private String reply;
    @ManyToOne(optional=false)
    @JoinColumn(name = "commentId")
    private CommentEntity commentEntity;
}
