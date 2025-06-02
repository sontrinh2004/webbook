package com.example.bookdahita.repository;

import com.example.bookdahita.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByOrderByIdDesc();
}
