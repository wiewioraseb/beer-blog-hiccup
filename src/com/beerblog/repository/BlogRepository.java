package com.beerblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerblog.entity.Blog;



public interface BlogRepository  extends JpaRepository<Blog, Integer>{

}
