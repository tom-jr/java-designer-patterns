package br.com.lab.package_004_factory_method.model;

public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document!");

    }

    @Override
    public void close() {
        System.out.println("Closing Excel document!");

    }
}
