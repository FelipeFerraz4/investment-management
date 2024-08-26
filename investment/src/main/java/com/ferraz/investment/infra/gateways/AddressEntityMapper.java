package com.ferraz.investment.infra.gateways;

import org.springframework.stereotype.Component;

import com.ferraz.investment.domain.Address;
import com.ferraz.investment.infra.persistence.AddressEntity;

@Component
public class AddressEntityMapper {
    public AddressEntity toEntity(Address address) {
        return AddressEntity.builder()
                .id(address.getId())
                .cep(address.getCep())
                .number(address.getNumber())
                .complement(address.getComplement())    
                .build();
    }

    public Address toDomain(AddressEntity addressEntity) {
        return Address.builder()
                .id(addressEntity.getId())
                .cep(addressEntity.getCep())
                .number(addressEntity.getNumber())
                .complement(addressEntity.getComplement())
                .build();
    }
}
