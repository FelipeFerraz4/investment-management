package com.ferraz.investment.infra.gateways;

import java.util.List;
import java.util.stream.Collectors;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.infra.persistence.UserEntity;
import com.ferraz.investment.infra.persistence.UserRepository;

public class UserRepositoryJpa {

    private final UserRepository repository;
    private final UserEntityMapper mapper;

    public UserRepositoryJpa(UserRepository repository, UserEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public User save(User user) {
        UserEntity userEntity = mapper.toEntity(user);
        UserEntity savedEntity = repository.save(userEntity);
        return mapper.toDomain(savedEntity);
    }

    public List<User> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
