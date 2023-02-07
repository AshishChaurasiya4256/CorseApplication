package com.CourseAppli.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseAppli.SpringRest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
