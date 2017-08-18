package com.shareknowledge.base;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Emon Hossain on 8/18/2017.
 */
@MappedSuperclass
public class Base {
    @CreatedBy
    private int createdBy;
    @CreatedDate
    private Date createdDate;
    @LastModifiedBy
    private int modifiedBy;
    @LastModifiedDate
    private Date modifiedDate;
}
