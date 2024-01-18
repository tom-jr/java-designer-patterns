package br.com.lab.package_002_null_object.com_null_object.model;

import br.com.lab.package_002_null_object.com_null_object.model.interfaces.IEndereco;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnderecoNotNull implements IEndereco {

    private String rua;

    @Override
    public String getRua() {
        return this.rua;
    }
}
