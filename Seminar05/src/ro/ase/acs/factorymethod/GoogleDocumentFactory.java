package ro.ase.acs.factorymethod;

import ro.ase.acs.factorymethod.exceptions.InvalidDocumentTypeException;
import ro.ase.acs.factorymethod.interfaces.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.interfaces.Document;

public class GoogleDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document getDocument(DocumentType documentType) throws InvalidDocumentTypeException {
        if (documentType == DocumentType.TEXT) {
            return new GoogleDoc();
        } else if (documentType == DocumentType.SPREADSHEET) {
            return new GoogleSpreadsheet();
        } else {
            throw new InvalidDocumentTypeException();
        }
    }
}
