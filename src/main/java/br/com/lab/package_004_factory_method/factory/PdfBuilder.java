package br.com.lab.package_004_factory_method.factory;

import br.com.lab.package_004_factory_method.model.Document;
import br.com.lab.package_004_factory_method.model.PdfDocument;

public class PdfBuilder extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
