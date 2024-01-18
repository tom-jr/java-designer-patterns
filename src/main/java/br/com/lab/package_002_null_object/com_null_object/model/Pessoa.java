package br.com.lab.package_002_null_object.com_null_object.model;

import br.com.lab.package_002_null_object.com_null_object.model.interfaces.IEndereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String pessoa;
    private IEndereco endereco;

    public Pessoa(String pessoa, IEndereco endereco) {
        this.pessoa = pessoa;
        this.endereco = (endereco == null) ? new EnderecoNull(): endereco;
    }
}
