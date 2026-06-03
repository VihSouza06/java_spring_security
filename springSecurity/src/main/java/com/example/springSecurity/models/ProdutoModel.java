package com.example.springSecurity.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JoinColumn(name = "pessoa_id")
    @JsonIgnoreProperties("produto")
    private PessoaModel pessoa;

}
