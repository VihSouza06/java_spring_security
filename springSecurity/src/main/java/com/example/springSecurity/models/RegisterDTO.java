package com.example.springSecurity.models;

import com.example.springSecurity.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
