package com.ferraz.investment.infra.gateways;

import org.springframework.stereotype.Component;

import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.infra.persistence.UserEntity;

@Component
public class UserEntityMapper {

    public UserEntity toEntity(User user) {
        return UserEntity.builder()
            .id(user.getId())
            .name(user.getName())
            .email(user.getEmail())
            .password(user.getPassword())
            .role(user.getRole())
            .build();
    }

    public User toDomain(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .role(userEntity.getRole())
                .build();
    }
}
