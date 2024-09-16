package com.ferraz.investment.domain.entities.user;

public enum UserRole {
    // Enum constants representing different user roles
    ADMIN("admin"),
    USER("user");

    // Field to store the role name
    private String role;

    // Constructor for the enum, assigning the role name
    UserRole(String role) {
        this.role = role;
    }

    // Getter method to retrieve the role name
    public String getRole(){
        return role;
    }
}
