package ro.ase.acs.factorymethod;

import ro.ase.acs.factorymethod.exceptions.InvalidDocumentTypeException;
import ro.ase.acs.factorymethod.interfaces.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.interfaces.Document;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) throws InvalidDocumentTypeException {
        if (documentType == DocumentType.TEXT) {
            return new MicrosoftWord();
        } else if (documentType == DocumentType.SPREADSHEET) {
            return new MicrosoftExcel();
        } else {
            throw new InvalidDocumentTypeException();
        }
    }
}
