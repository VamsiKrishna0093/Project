package com.insurance.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
