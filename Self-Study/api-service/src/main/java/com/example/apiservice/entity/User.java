package com.example.apiservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bigshowzyb
 * @date 2019/6/20
 */
@Data
@Entity
@Table(name = "user_tbl")
public class User extends BaseEntity{

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_age")
    private Integer age;

    @Column(name = "user_address")
    private String address;

}
