package com.example.finalwork.actions;

import com.example.finalwork.model.Course;
import org.springframework.data.repository.CrudRepository;


public interface UserInfoAction extends CrudRepository<Course, Long> {

}
