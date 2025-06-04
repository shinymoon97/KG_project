package com.example.demo.user.service;

import com.example.demo.user.entity.UserForm;
import com.example.demo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserForm user) {
        userRepository.save(user);
    }
}