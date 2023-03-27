package ro.ase.acs.factorymethod;

import ro.ase.acs.factorymethod.interfaces.Document;

public class MicrosoftExcel implements Document {
    private String name;

    MicrosoftExcel() {
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
        System.out.println("Opening the MicrosoftExcel " + name);
    }
}
