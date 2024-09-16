package com.ferraz.investment.infra.persistence;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // Marks this class as a JPA entity, allowing it to be mapped to a database table
public class AddressEntity {

    @Id // Marks this field as the primary key for the entity
    @Column(name = "id", nullable = false, updatable = false, unique = true) // Column definition with properties: not nullable, not updatable, and unique
    private UUID id;

    @Column(name = "cep", nullable = false) // Maps this field to a non-nullable column named "cep" in the database
    private String cep;

    @Column(name = "number", nullable = false) // Maps this field to a non-nullable column named "number" in the database
    private String number;

    @Column(name = "complement") // Maps this field to a column named "complement" (default nullable)
    private String complement;
}
