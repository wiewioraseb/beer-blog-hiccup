package com.beerblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerblog.entity.Item;



public interface ItemRepository extends JpaRepository<Item, Integer> {

}
