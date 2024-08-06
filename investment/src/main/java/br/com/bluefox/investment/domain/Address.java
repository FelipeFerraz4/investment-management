package br.com.bluefox.investment.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String cep;
    private String number;
    private String complement;
}
