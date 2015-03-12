package com.beerblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerblog.entity.Item;
import com.beerblog.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}

	public Item findOne(int id) {
		
		return itemRepository.findOne(id);
	}
}