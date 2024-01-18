package br.com.lab.package_002_null_object.sem_null_object.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private Endereco endereco;
}
