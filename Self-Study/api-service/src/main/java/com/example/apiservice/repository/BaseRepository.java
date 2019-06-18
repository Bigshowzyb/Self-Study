package com.example.apiservice.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author youbo
 * @date 2019/6/18
 */
public interface BaseRepository<T> extends PagingAndSortingRepository<T,Integer>, JpaSpecificationExecutor<T> {

}
