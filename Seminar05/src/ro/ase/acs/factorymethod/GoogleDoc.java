package ro.ase.acs.factorymethod;

import ro.ase.acs.factorymethod.interfaces.Document;

public class GoogleDoc implements Document {
    private String name;

    GoogleDoc() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening the GoogleDoc " + name);
    }
}
