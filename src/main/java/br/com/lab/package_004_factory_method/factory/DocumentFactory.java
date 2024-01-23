package br.com.lab.package_004_factory_method.factory;

import br.com.lab.package_004_factory_method.model.Document;

public abstract class DocumentFactory {

    public abstract Document createDocument();

    public Document buildDocument() {
        return createDocument();
    }
}
