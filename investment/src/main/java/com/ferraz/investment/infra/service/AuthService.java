package com.ferraz.investment.infra.service;

import com.ferraz.investment.domain.entities.user.User;

public interface AuthService {
    User login(String email, String password);
}
