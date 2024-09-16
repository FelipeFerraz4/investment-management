package com.ferraz.investment.domain.entities.user;

import com.ferraz.investment.domain.Address;
import java.time.LocalDate;
import java.util.UUID;

public class UserFactory {
    private User user;

    public User withNameCpfDateOfBirth(String name, String cpf, LocalDate dateOfBirth, UserRole role) {
        this.user = new User(cpf, name, dateOfBirth, "", "", role);
        return  this.user;
    }

    public User withNameCpfDateOfBirth(String name, String cpf, LocalDate dateOfBirth, String email, String password, UserRole role) {
        this.user = new User(cpf, name, dateOfBirth, email, password, role);
        return  this.user;
    }

    public User includesAddress(String cep, String number, String complement){
        this.user.setAddress(new Address(UUID.randomUUID() , cep, number, complement));
        return this.user;
    }
}
