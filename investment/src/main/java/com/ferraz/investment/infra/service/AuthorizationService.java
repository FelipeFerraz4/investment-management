package com.ferraz.investment.infra.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.ferraz.investment.domain.entities.user.User;

public interface AuthorizationService {
    UserDetails findByEmail(String email);

    void save(User user);
}
