package com.example.apiservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author youbo
 * @date 2019/6/18
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Integer id;

    private String name;

    private Integer age;

    private String address;
}
