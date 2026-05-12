package com.example.springSecurity.controllers;

import com.example.springSecurity.models.PessoaModel;
import com.example.springSecurity.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> buscarPessoas(){
        return  pessoaService.buscarPessoas();
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return  pessoaService.criarPessoa(pessoaModel);
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id){
        pessoaService.deletarPessoa(id);
    }

    @PutMapping("/{id}")
    public PessoaModel atualizarPessoa
            (@RequestBody PessoaModel pessoaModel, @PathVariable Long id){
        return pessoaService.atualizarPessoa(pessoaModel, id);
    }
}
