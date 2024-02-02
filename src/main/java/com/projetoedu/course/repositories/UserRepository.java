package com.projetoedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoedu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
