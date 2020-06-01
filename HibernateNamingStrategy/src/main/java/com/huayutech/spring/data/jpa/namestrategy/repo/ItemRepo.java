package com.huayutech.spring.data.jpa.namestrategy.repo;

import com.huayutech.spring.data.jpa.namestrategy.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
