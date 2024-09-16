package com.ferraz.investment.infra.persistence;

import java.time.LocalDate;
import java.util.UUID;

import com.ferraz.investment.domain.entities.user.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "users") // Maps this entity to the "users" table in the database
public class UserEntity {
    
    @Id // Marks this field as the primary key
    @Column(name = "id", nullable = false, updatable = false, unique = true) // Defines column properties for the "id" field
    private UUID id;

    @Column(name = "cpf", nullable = false, unique = true) // Maps the "cpf" field to a unique, non-nullable column
    private String cpf;

    @Column(name = "name", nullable = false) // Maps the "name" field to a non-nullable column
    private String name;

    @Column(name = "date_of_birth", nullable = false) // Maps the "dateOfBirth" field to a non-nullable column
    private LocalDate dateOfBirth;

    @Column(name = "email", nullable = false, unique = true) // Maps the "email" field to a unique, non-nullable column
    private String email;

    @Column(name = "password", nullable = false) // Maps the "password" field to a non-nullable column
    private String password;

    @Enumerated(EnumType.STRING) // Specifies that the enum should be stored as a String
    @Column(name = "role", nullable = false) // Maps the "role" field to a non-nullable column
    private UserRole role;
    
    @ManyToOne // Defines a many-to-one relationship with AddressEntity
    @JoinColumn(name = "address_id") // Specifies the foreign key column "address_id" in the "users" table
    private AddressEntity address;
    
}
