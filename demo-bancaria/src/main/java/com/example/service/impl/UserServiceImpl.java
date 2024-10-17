package com.example.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.domain.model.User;
import com.example.domain.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private static final String Throw = null;
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        // if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
        //     throw new IllegalArgumentException("This user ID already existis.");
        // }
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists.");
        }
            return userRepository.save(userToCreate);
    }

}
