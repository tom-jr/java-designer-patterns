package br.com.lab.package_004_factory_method.service;

import br.com.lab.package_004_factory_method.factory.PdfBuilder;
import br.com.lab.package_004_factory_method.model.Document;

public class DocumentService {
    public static void main(String[] args) {
        Document pdfDoc = new PdfBuilder().createDocument();
        pdfDoc.open();
    }
}
