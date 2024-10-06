package com.ferraz.investment.infra.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LoginDTO(
    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    String email,
    
    @NotNull(message = "Password cannot be null")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    String password
    ) {}
