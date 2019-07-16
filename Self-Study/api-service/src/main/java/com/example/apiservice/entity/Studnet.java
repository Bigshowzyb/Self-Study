package com.example.apiservice.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @date 2019/7/16
 */
@Data
@Entity
@Table(name = "student_tbl")
public class Studnet extends BaseEntity{

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_age")
    private Integer age;

    @Column(name = "student_score")
    private Integer score;

}
