package com.ferraz.investment.infra.service.impl;

import java.util.UUID;
import java.util.List;
import org.springframework.stereotype.Service;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.infra.persistence.UserEntity;
import com.ferraz.investment.infra.gateways.UserEntityMapper;
import com.ferraz.investment.infra.persistence.UserRepository;
import com.ferraz.investment.infra.service.UserService;

import java.util.NoSuchElementException;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    private final UserEntityMapper mapper;
    
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository, UserEntityMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }
    

    @Override
    public List<User> searchAll() {
        return userRepository.findAll().stream()
                        .map(mapper::toDomain)
                        .toList();
    }
    @Override
    public User searchById(UUID userId) {
        UserEntity userEntity = userRepository.findById(userId)
            .orElseThrow(() -> new NoSuchElementException("User not found"));
        return mapper.toDomain(userEntity);
    }
    
    @Override
    public void insert(User user) {
        userRepository.save(mapper.toEntity(user));
    }

    @Override
    public void update(UUID userId, User user) {
        UserEntity userEntity = userRepository.findById(userId)
            .orElseThrow(() -> new NoSuchElementException("User not found"));
        
        UserEntity updatedEntity = mapper.toEntity(user);
        userEntity.setName(updatedEntity.getName());
        userEntity.setEmail(updatedEntity.getEmail());
        userEntity.setPassword(updatedEntity.getPassword());
        userEntity.setRole(updatedEntity.getRole());
    
        userRepository.save(userEntity);
    }

    @Override
    public void delete(UUID userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new NoSuchElementException("User not found");
        }
    }
    
    
}
