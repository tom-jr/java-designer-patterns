package br.com.lab.package_004_factory_method.model;

public class PdfDocument extends Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document!");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document!");
    }
}
