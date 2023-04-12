package com.patrickmartins.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickmartins.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
