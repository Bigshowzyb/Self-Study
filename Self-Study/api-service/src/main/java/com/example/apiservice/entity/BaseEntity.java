package com.example.apiservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import javax.persistence.*;
import java.util.Date;

/**
 * 公共实体类
 * 这个公共类中封装了实体基本属性：id，createTime，updateTime，createUser
 */
@MappedSuperclass
@JsonIgnoreProperties(value = {"new"})
public class BaseEntity implements Persistable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10, columnDefinition = "int(10) comment '主键'")
    private Integer id;

    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "create_user")
    @CreatedBy
    private String createUser;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;

    @Column(name = "update_user")
    @LastModifiedBy
    private String updateUser;

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
