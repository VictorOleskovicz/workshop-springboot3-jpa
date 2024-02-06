package com.projetoedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoedu.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
