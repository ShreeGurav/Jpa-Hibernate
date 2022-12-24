package com.jpahibernate.jpahibernate.repository;

import com.jpahibernate.jpahibernate.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findBiId(Long id){
        return entityManager.find(Course.class,id);
    }
}
