package br.diolabs.microservicoscloud.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.diolabs.microservicoscloud.model.Produto;

public interface ProdutoRepository extends ElasticsearchRepository<Produto, Long>  {
    
}
