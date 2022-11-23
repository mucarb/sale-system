package com.murilo.salesystem;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.salesystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
