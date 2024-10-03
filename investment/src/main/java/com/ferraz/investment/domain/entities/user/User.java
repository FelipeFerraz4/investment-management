package com.ferraz.investment.domain.entities.user;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    public User (String name, String email, String password, UserRole role) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
