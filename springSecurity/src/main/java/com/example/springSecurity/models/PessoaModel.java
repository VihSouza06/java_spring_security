package com.example.springSecurity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity // Avisa ao JPA que está deve virar uma tabela no banco
@Table(name = "pessoas") // Define o nome da tabela no banco
@Data
public class PessoaModel {

    @Id // Define o atributo como chave primária

    // Define que o ID será gerado automaticamente
    // IDENTITY - o banco decide o Id, o proximo número
    // UUID - gera um numero grande e segreto
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome_estudante") // Atribui uma caracteristica para esta coluna
    private String nome;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ProdutoModel> produto;

}
