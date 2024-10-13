package com.ferraz.investment.infra.service.impl;

import org.springframework.stereotype.Service;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.exception.PasswordMismatchException;
import com.ferraz.investment.infra.gateways.UserEntityMapper;
import com.ferraz.investment.infra.persistence.UserEntity;
import com.ferraz.investment.infra.persistence.UserRepository;
import com.ferraz.investment.infra.service.AuthService;

import java.util.NoSuchElementException;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthServiceImpl implements AuthService{
    private final UserEntityMapper mapper;
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository, UserEntityMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public User login(String email, String password) {
        UserEntity userEntity = userRepository.findByEmail(email)
            .orElseThrow(() -> new NoSuchElementException("User not found"));

        User user = mapper.toDomain(userEntity);
        if (!user.getPassword().equals(password)){
            throw new PasswordMismatchException("User Invalid");
        }

        return user;
        
    }
}
