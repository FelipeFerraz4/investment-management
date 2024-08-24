package com.ferraz.investment.infra.gateways;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.infra.persistence.UserEntity;

public class UserEntityMapper {

    private final AddressEntityMapper mapper;

    public UserEntityMapper(AddressEntityMapper mapper) {
        this.mapper = mapper;
    }

    public UserEntity toEntity(User user) {
        return UserEntity.builder()
            .id(user.getId())
            .cpf(user.getCpf())
            .name(user.getName())
            .dateOfBirth(user.getDateOfBirth())
            .email(user.getEmail())
            .password(user.getPassword())
            .address(mapper.toEntity(user.getAddress()))
            .build();
    }

    public User toDomain(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .cpf(userEntity.getCpf())
                .name(userEntity.getName())
                .dateOfBirth(userEntity.getDateOfBirth())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .address(mapper.toDomain(userEntity.getAddress()))
                .build();
    }
}
