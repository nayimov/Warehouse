package com.example.warehouse.dto;

public class UserDTO {
 private String name;

    public UserDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
