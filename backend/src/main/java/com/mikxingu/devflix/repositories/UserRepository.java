package com.mikxingu.devflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikxingu.devflix.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
