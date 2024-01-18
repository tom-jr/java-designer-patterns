package br.com.lab.package_002_null_object.com_null_object.service;

import br.com.lab.package_002_null_object.com_null_object.model.EnderecoNotNull;
import br.com.lab.package_002_null_object.com_null_object.model.Pessoa;

public class ServiceNullObject {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Harry", new EnderecoNotNull("Rua dos alfeneiros"));
        Pessoa pessoa2 = new Pessoa("Marvin",null);

        System.out.println(pessoa1.getEndereco().getRua());
        System.out.println(pessoa2.getEndereco().getRua());
    }
}
