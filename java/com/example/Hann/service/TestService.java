package com.example.Hann.service;

import com.example.Hann.entity.User;
import com.example.Hann.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

}
