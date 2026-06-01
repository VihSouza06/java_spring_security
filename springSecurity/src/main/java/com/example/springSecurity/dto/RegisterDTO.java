package com.example.springSecurity.dto;

import com.example.springSecurity.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
