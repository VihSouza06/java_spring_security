package com.example.springSecurity.services;

import com.example.springSecurity.models.ProdutoModel;
import com.example.springSecurity.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> buscarPessoas(){
        return  produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return  produtoRepository.save(produtoModel);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

    public ProdutoModel atualizarProduto(ProdutoModel produtoModel, Long id){
        ProdutoModel p = produtoRepository.findById(id).get();
        p.setNome(produtoModel.getNome());
        p.setQuantidade(produtoModel.getQuantidade());
        return produtoRepository.save(p);
    }

}
