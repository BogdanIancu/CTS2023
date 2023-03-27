package ro.ase.acs.main;

import ro.ase.acs.factorymethod.*;
import ro.ase.acs.factorymethod.exceptions.InvalidDocumentTypeException;
import ro.ase.acs.factorymethod.interfaces.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.interfaces.Document;
import ro.ase.acs.singletonregistry.Logger;
import ro.ase.acs.singletonregistry.SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry = new SingletonRegistry();
        Logger logger = singletonRegistry.getSingleton("logger");
        logger.log("Something...");

        SingletonRegistry.DatabaseConnection databaseConnection =
                singletonRegistry.getSingleton("databaseConnection");
        databaseConnection.connect();

        AbstractDocumentFactory documentFactory = new MicrosoftDocumentFactory();
        try {
            Document document = documentFactory.getDocument(DocumentType.TEXT);
            document.setName("My document");
            document.open();
        } catch (InvalidDocumentTypeException e) {
            throw new RuntimeException(e);
        }

    }
}