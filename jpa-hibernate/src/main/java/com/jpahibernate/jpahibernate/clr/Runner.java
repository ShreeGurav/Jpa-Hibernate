package com.jpahibernate.jpahibernate.clr;

import com.jpahibernate.jpahibernate.entity.Course;
import com.jpahibernate.jpahibernate.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class Runner implements CommandLineRunner {

    private Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository repository;


    @Override
    public void run(String... args) throws Exception {

        Course course=repository.findBiId(1001l);
        logger.info("Course 1001-{}",course);
    }
}
