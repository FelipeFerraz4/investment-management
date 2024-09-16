package com.ferraz.investment.domain.entities.user;

import com.ferraz.investment.domain.Address;
import lombok.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User implements UserDetails{
    private UUID id;
    private String cpf;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String password;
    private UserRole role;

    private Address address;

    public User (String cpf, String name, LocalDate dateOfBirth, String email, String password, UserRole role) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.email;
    }

    // @Override
    // public boolean isAccountNonExpired() {
    //     // TODO Auto-generated method stub
    //     return UserDetails.super.isAccountNonExpired();
    // }

    // @Override
    // public boolean isAccountNonLocked() {
    //     // TODO Auto-generated method stub
    //     return UserDetails.super.isAccountNonLocked();
    // }

    // @Override
    // public boolean isCredentialsNonExpired() {
    //     // TODO Auto-generated method stub
    //     return UserDetails.super.isCredentialsNonExpired();
    // }

    // @Override
    // public boolean isEnabled() {
    //     // TODO Auto-generated method stub
    //     return UserDetails.super.isEnabled();
    // }
}
