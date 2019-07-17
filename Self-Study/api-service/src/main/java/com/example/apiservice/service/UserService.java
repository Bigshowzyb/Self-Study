package com.example.apiservice.service;

import com.example.apiservice.entity.User;
import com.example.apiservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author youbo
 * @date 2019/7/17
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void getAllUsers() {
        //设置排序条件：按照createTime进行降序排序
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");

        //设置分页条件：第二页，每页有三条记录
        int pageNo = 2 - 1;
        int pageSize = 3;

        //封装分页查询条件
        PageRequest pageable = PageRequest.of(pageNo, pageSize, sort);

        //定义自定义查询条件，指定需要查询的对象，通常使用Specification的匿名内部类
        Specification<User> specification = new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                Predicate predicate1 = cb.equal(root.get("name"), "zhangsan");
                Predicate predicate2 = cb.equal(root.get("age"), Integer.valueOf(22));
                predicates.add(predicate1);
                predicates.add(predicate2);

                Predicate[] predicate = new Predicate[predicates.size()];
                return cb.and(predicates.toArray(predicate));
            }
        };

        Page<User> page = userRepository.findAll(specification, pageable);
        List<User> content = page.getContent();
        for (User user : content) {
            System.out.println(user.toString());
            System.out.println("*******************************************************");
        }
    }

    public void createUsers() {
        List<User> userList = new ArrayList<>();
        User user;
        for (int i = 0; i < 50; i++) {
            user = new User();
            user.setName("Jame" + i);
            user.setAge(15 + i);
            user.setAddress("China" + i);
            userList.add(user);
        }

        Iterator<User> iterator = userList.iterator();

    }
}
