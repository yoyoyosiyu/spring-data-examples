package com.huayutech.spring.data.jpa.namestrategy.repo;

import com.huayutech.spring.data.jpa.namestrategy.entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepo extends JpaRepository<ItemCategory, Long> {
}
