package com.nimap.nimap_test.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.nimap_test.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
