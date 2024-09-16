package com.ferraz.investment.infra.controller;

import java.util.UUID;
import java.time.LocalDate;

import com.ferraz.investment.domain.Address;
import com.ferraz.investment.domain.entities.user.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public record UserDTO(
    @NotNull(message = "ID cannot be null")
    UUID id,

    @NotNull(message = "CPF cannot be null")
    @Size(min = 11, max = 11, message = "CPF must be 11 characters long")
    String cpf,

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    String name,

    @NotNull(message = "Date of birth cannot be null")
    @Past(message = "Date of birth must be in the past")
    LocalDate dateOfBirth,

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    String email,

    @NotNull(message = "Password cannot be null")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    String password,

    @NotNull(message = "Address cannot be null")
    Address address) {
    
    public UserDTO(User user){
        this(user.getId(), 
            user.getCpf(), 
            user.getName(), 
            user.getDateOfBirth(), 
            user.getEmail(), 
            user.getPassword(),
            user.getAddress());
    }

    public User getUser() {
        return User.builder()
                .id(this.id)
                .cpf(this.cpf)
                .name(this.name)
                .dateOfBirth(this.dateOfBirth)
                .email(this.email)
                .password(this.password)
                .address(this.address)
                .build();
    }
}
