package com.shareknowledge.comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Emon Hossain on 8/24/2017.
 */
@Entity
@Table(name = "replies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;
    private String reply;
    @ManyToOne
    @JoinColumn(name = "commentId")
    private CommentEntity commentEntity;
}
