package com.example.apiservice.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author youbo
 * @date 2019/6/18
 */
@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @NotBlank(message = "用户名不能为空")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "用户年龄不能为空")
    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;
}
