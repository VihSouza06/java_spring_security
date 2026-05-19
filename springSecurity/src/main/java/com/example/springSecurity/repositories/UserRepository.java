package com.example.springSecurity.repositories;

import com.example.springSecurity.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/*
 * Repository responsável por acessar os dados
 * da entidade User no banco de dados.
 *
 * JpaRepository já fornece métodos prontos como:
 * - save()
 * - findAll()
 * - findById()
 * - delete()
 *
 * Não é necessário escrever SQL manualmente
 * para operações básicas.
 */

public interface UserRepository extends JpaRepository<UserModel, Long> {

    /*
     * Método responsável por buscar um usuário
     * através do login.
     *
     * O Spring Data JPA cria a consulta automaticamente
     * baseado no nome do método.
     *
     * Exemplo gerado:
     * SELECT * FROM users WHERE login = ?
     *
     * Retorna um UserDetails,
     * utilizado pelo Spring Security
     * no processo de autenticação.
     */

    UserDetails findByLogin(String role);
}
