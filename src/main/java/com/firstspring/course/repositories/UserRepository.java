package com.firstspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
