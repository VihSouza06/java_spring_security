package com.example.springSecurity.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "jobs")
@Data
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;

}
