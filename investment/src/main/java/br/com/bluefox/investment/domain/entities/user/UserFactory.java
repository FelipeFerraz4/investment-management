package br.com.bluefox.investment.domain.entities.user;

import br.com.bluefox.investment.domain.Address;

import java.time.LocalDate;
import java.util.UUID;

public class UserFactory {
    private User user;

    public User withNameCpfDateOfBirth(String name, String cpf, LocalDate dateOfBirth) {
        this.user = new User(cpf, name, dateOfBirth, "", "");
        return  this.user;
    }

    public User withNameCpfDateOfBirth(String name, String cpf, LocalDate dateOfBirth, String email, String password) {
        this.user = new User(cpf, name, dateOfBirth, email, password);
        return  this.user;
    }

    public User includesAddress(String cep, String number, String complement){
        this.user.setAddress(new Address(UUID.randomUUID() , cep, number, complement));
        return this.user;
    }
}
