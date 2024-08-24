package com.ferraz.investment.infra.persistence;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private UUID id;
    private String cpf;
    private String name;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    private String email;
    private String password;
    @ManyToOne
    private AddressEntity address;
}
