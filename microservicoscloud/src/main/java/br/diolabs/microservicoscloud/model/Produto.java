package br.diolabs.microservicoscloud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Document(indexName = "produto")
public class Produto {

    @Id
    private Long id;

    @Field(type = FieldType.Text, name = "nome")
    private String nome;

    @Field(type = FieldType.Integer, name = "quantidade")
    private Integer quantidade;
    
}
