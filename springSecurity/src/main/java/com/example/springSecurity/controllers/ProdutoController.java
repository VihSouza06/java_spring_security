package com.example.springSecurity.controllers;

import com.example.springSecurity.models.ProdutoModel;
import com.example.springSecurity.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> buscarPessoas(){
        return  produtoService.buscarPessoas();
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel){
        return  produtoService.criarProduto(produtoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto
            (@RequestBody ProdutoModel produtoModel, @PathVariable Long id){
        return produtoService.atualizarProduto(produtoModel, id);
    }
}
