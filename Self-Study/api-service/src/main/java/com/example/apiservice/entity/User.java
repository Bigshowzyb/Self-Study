package com.example.apiservice.entity;

import lombok.Data;

import javax.persistence.*;

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

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Studnet studnet;

}
