package com.ferraz.investment.infra.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.infra.gateways.UserEntityMapper;
import com.ferraz.investment.infra.persistence.UserRepository;
import com.ferraz.investment.infra.service.AuthorizationService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthorizationServiceImpl implements AuthorizationService, UserDetailsService{

    private final UserEntityMapper mapper;
    
    private final UserRepository userRepository;

    public AuthorizationServiceImpl(UserRepository userRepository, UserEntityMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username);
    }

    @Override
    public UserDetails findByEmail(String email) {
       return userRepository.findByEmail(email);
    }

    @Override
    public void save(User user) {
        userRepository.save(mapper.toEntity(user));
    }    
}
