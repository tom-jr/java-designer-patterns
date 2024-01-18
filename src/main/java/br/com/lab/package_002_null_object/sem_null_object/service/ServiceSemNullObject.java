package br.com.lab.package_002_null_object.sem_null_object.service;

import br.com.lab.package_002_null_object.sem_null_object.model.Endereco;
import br.com.lab.package_002_null_object.sem_null_object.model.Pessoa;

public class ServiceSemNullObject {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Tom", new Endereco("São Tomé"));
        Pessoa pessoa2 = new Pessoa("Lara", null);

        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa2.getEndereco().getRua());
    }
}
