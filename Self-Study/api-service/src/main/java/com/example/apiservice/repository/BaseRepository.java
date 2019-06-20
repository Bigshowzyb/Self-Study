package com.example.apiservice.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @NoRepositoryBean
 * 相当于你在使用spring data jpa 的时候，每个实体类有需要实现的相同的方法，就可以单独抽取出来，放在一个公共的接口BaseRepository中，
 * 并这个类继承了jpa的相关Repository接口或类，由BaseRepository接口来衔接jpa的相关操作，其他实体类需要实现的操作就直接继承BaseRepository接口，
 * 不用每次都去继承jpa的相关接口或类啦，所以这个公共接口就需要这个注解@NoRepositoryBean来标识
 */

@NoRepositoryBean
public interface BaseRepository<T> extends PagingAndSortingRepository<T,Integer>, JpaSpecificationExecutor<T> {

}
