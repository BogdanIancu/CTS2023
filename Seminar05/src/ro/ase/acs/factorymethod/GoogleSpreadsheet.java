package ro.ase.acs.factorymethod;

import ro.ase.acs.factorymethod.interfaces.Document;

public class GoogleSpreadsheet implements Document {
    private String name;

    GoogleSpreadsheet() {
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
        System.out.println("Opening the Google spreadsheet " + name);
    }
}
