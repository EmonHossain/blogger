package com.shareknowledge.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

/**
 * Created by Emon Hossain on 8/18/2017.
 */

public abstract class Audit {
    @CreatedBy
    private int createdBy;
    @CreatedDate
    private Date createdDate;
    @LastModifiedBy
    private int modifiedBy;
    @LastModifiedDate
    private Date modifiedDate;
}
