package com.ferraz.investment.domain.entities.user;

import com.ferraz.investment.domain.Address;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private UUID id;
    private String cpf;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String password;

    private Address address;

    public User (String cpf, String name, LocalDate dateOfBirth, String email, String password) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }
}
