package com.beerblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerblog.entity.Entry;



public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
