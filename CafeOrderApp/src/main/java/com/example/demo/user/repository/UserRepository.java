package com.example.demo.user.repository;

import com.example.demo.user.entity.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserForm, Long> {
}