package br.com.bluefox.investment.infra.gateways;

import br.com.bluefox.investment.domain.entities.user.User;
import br.com.bluefox.investment.infra.persistence.UserEntity;

public class UserEntityMapper {
    public UserEntity toEntity(User user) {
        return UserEntity.builder()
            .id(user.getId())
            .cpf(user.getCpf())
            .name(user.getName())
            .dateOfBirth(user.getDateOfBirth())
            .email(user.getEmail())
            .password(user.getPassword())
            .address(user.getAddress())
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
                .address(userEntity.getAddress())
                .build();
    }
}
