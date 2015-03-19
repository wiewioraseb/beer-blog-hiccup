package com.beerblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerblog.entity.Entry;
import com.beerblog.repository.EntryRepository;

@Service
public class EntryService {

	@Autowired
	private EntryRepository itemRepository;
	
	public List<Entry> findAll(){
		return itemRepository.findAll();
	}

	public Entry findOne(int id) {
		
		return itemRepository.findOne(id);
	}
}