package com.fupto.back.repository;

import com.fupto.back.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByLevel(Integer level);
    List<Category> findByLevelAndParentId(Integer level, Long parentId);
    List<Category> findByParentIdOrderByName(Long parentId);
}