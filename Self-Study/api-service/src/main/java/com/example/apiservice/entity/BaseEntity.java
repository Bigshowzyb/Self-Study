package com.example.apiservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Date;

/**
 * @author youbo
 * @date 2019/6/18
 */
@MappedSuperclass
@JsonIgnoreProperties(value = {"new"})
public class BaseEntity implements Persistable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10, columnDefinition = "int(10) comment '主键'")
    private Integer id;

    @Column(name = "create_time")
    private Date createTime = new Date();

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "create_user")
    private String createUser;

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
