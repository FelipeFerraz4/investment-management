package br.com.bluefox.investment.domain.entities.user;

import br.com.bluefox.investment.domain.Address;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private String cpf;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String password;

    private Address address;

    public User (String cpf, String name, LocalDate dateOfBirth, String email, String password) {
        this.cpf = cpf;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }
}
