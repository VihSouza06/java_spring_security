package com.example.springSecurity.repositories;

import com.example.springSecurity.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

// Responsável por acessar os dados da entidade User no banco
public interface UserRepository extends JpaRepository<UserModel, Long> {

    // Método responsável por buscar um usuário através do login.
    UserDetails findByLogin(String login);
}
