package br.com.bluefox.investment.domain;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private UUID id;
    private String cep;
    private String number;
    private String complement;
}
