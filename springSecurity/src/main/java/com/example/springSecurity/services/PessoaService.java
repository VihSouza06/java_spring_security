package com.example.springSecurity.services;

import com.example.springSecurity.models.PessoaModel;
import com.example.springSecurity.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<PessoaModel> buscarPessoas(){
        return  produtoRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel){
        return  produtoRepository.save(pessoaModel);
    }

    public void deletarPessoa(Long id){
        produtoRepository.deleteById(id);
    }

    public PessoaModel atualizarPessoa(PessoaModel pessoaModel, Long id){
        PessoaModel p = produtoRepository.findById(id).get();
        p.setNome(pessoaModel.getNome());
        return produtoRepository.save(p);
    }

}
