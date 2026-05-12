package com.example.springSecurity.repositories;

import com.example.springSecurity.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<PessoaModel, Long> {
}
