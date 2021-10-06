package br.diolabs.microservicoscloud.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.diolabs.microservicoscloud.model.Produto;
import br.diolabs.microservicoscloud.repository.ProdutoRepository;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepository produtoRepository;

  public Produto save(final Produto produto) {
    return produtoRepository.save(produto);
  }

  public List<Produto> listarTodos() {
    List<Produto> lista = new ArrayList<>();
    produtoRepository.findAll().forEach(lista::add);
    return lista;    
  }

}
