package com.ferraz.investment.infra.service;

import com.ferraz.investment.domain.entities.user.User;
import java.util.UUID;
import java.util.List;

public interface UserService {
    List<User> searchAll();

    User searchById(UUID userId);

    User insert(User user);

    void update(UUID userId, User user);

    void delete(UUID userId);
}
