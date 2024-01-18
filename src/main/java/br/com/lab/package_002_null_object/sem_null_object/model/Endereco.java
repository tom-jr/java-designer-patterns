package br.com.lab.package_002_null_object.sem_null_object.model;

import lombok.Getter;

@Getter
public class Endereco {
    private final String rua;

    public Endereco(String rua) {
        this.rua = rua;
    }
}
