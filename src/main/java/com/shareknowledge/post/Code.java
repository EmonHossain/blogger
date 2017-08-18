package com.shareknowledge.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Code {
    private Long codeId;
    private String code;

    public Code(Long codeId) {
        this.codeId = codeId;
    }
}
