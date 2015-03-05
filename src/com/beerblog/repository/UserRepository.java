package com.beerblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerblog.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
