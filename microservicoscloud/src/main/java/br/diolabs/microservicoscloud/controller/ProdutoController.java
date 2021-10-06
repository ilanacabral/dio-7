package br.diolabs.microservicoscloud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.diolabs.microservicoscloud.model.Produto;

import br.diolabs.microservicoscloud.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto criarProduo(@Valid @RequestBody Produto produto){
        return produtoService.save(produto);        
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listarTodos(){
        return produtoService.listarTodos();      
    }
    
}
