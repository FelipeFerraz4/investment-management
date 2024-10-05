package com.ferraz.investment.infra.controller;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ferraz.investment.domain.entities.user.User;
import com.ferraz.investment.domain.entities.user.UserRole;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserDTO(
    UUID id,

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    String name,

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    String email,

    @NotNull(message = "Password cannot be null")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    String password,
    
    UserRole role) {    
    public UserDTO(User user){
        this(user.getId(), 
            user.getName(), 
            user.getEmail(), 
            user.getPassword(),
            user.getRole());
    }

    @JsonIgnore
    public User getUser() {
        return User.builder()
                .id(this.id)
                .name(this.name)
                .email(this.email)
                .password(this.password)
                .role(this.role)
                .build();
    }
}
