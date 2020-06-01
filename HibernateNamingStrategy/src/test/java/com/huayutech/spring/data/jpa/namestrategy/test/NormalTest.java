package com.huayutech.spring.data.jpa.namestrategy.test;


import com.huayutech.spring.data.jpa.namestrategy.entity.Item;
import com.huayutech.spring.data.jpa.namestrategy.entity.ItemCategory;
import com.huayutech.spring.data.jpa.namestrategy.repo.ItemCategoryRepo;
import com.huayutech.spring.data.jpa.namestrategy.repo.ItemRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {JpaConfig.class})
public class NormalTest {

    @Autowired
    ItemCategoryRepo itemCategoryRepo;

    @Autowired
    ItemRepo itemRepo;

    @Test
    @Transactional
    public void health() {

        Assert.assertNotNull(itemCategoryRepo);

    }

    @Test
    public void create() {
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.setId(10000L);
        itemCategory.setName("Operation System");
        itemCategoryRepo.save(itemCategory);
    }

    @Test
    public void delete() {
        itemCategoryRepo.deleteById(10000L);
    }

    @Test
    public void createItem() {
        Item item = new Item();
        item.setItemCategory(itemCategoryRepo.getOne(10000L));
        item.setItemId(10000L);
        item.setName("Windows 10");
        itemRepo.save(item);
    }

}
