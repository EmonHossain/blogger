package com.shareknowledge.base;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@MappedSuperclass
@Data
public abstract class BaseProperty {
    @CreatedBy
    private int createdBy;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @LastModifiedBy
    private int modifiedBy;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public BaseProperty(){
        this.createdDate = new Date();
    }
}
