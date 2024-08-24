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
@Entity
public class AddressEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String number;

    private String complement;
}
