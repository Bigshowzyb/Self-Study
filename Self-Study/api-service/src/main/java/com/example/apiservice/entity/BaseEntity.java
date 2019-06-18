package com.example.apiservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author youbo
 * @date 2019/6/18
 */
@MappedSuperclass
@JsonIgnoreProperties(value = {"new"})
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2696182862745450253L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 10, columnDefinition = "int(10) comment '主键'")
    private Integer id;

    private Date createTime = new Date();

    private Date updateTime;

    private String createUser;
}
