package com.beerblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerblog.entity.BlogEntry;



public interface EntryRepository extends JpaRepository<BlogEntry, Integer> {

	
	
}
