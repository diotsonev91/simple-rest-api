package com.codecademy.diningreviewapi.repositories;

import com.codecademy.diningreviewapi.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
