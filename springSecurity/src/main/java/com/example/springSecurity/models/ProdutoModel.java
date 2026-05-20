package com.example.springSecurity.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produtos")
@Data
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    @ManyToOne
    private PessoaModel pessoaModel;

}
