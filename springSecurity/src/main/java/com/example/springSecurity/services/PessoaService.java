package com.example.springSecurity.services;

import com.example.springSecurity.models.PessoaModel;
import com.example.springSecurity.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> buscarPessoas(){
        return  pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel){
        return  pessoaRepository.save(pessoaModel);
    }

    public void deletarPessoa(Long id){
        pessoaRepository.deleteById(id);
    }

    public PessoaModel atualizarPessoa(PessoaModel pessoaModel, Long id){
        PessoaModel p = pessoaRepository.findById(id).get();
        p.setNome(pessoaModel.getNome());
        return pessoaRepository.save(p);
    }

}