package br.com.lab.package_002_null_object.com_null_object.model;

import br.com.lab.package_002_null_object.com_null_object.model.interfaces.IEndereco;

public class EnderecoNull implements IEndereco {
    @Override
    public String getRua() {
        return "Nothing to show";
    }
}
