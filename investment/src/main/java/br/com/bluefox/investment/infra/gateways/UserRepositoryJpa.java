package br.com.bluefox.investment.infra.gateways;

import java.util.List;
import java.util.stream.Collectors;
import br.com.bluefox.investment.domain.entities.user.User;
import br.com.bluefox.investment.infra.persistence.UserEntity;
import br.com.bluefox.investment.infra.persistence.UserRepository;

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
