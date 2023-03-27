package ro.ase.acs.factorymethod.interfaces;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.exceptions.InvalidDocumentTypeException;

public interface AbstractDocumentFactory {
    Document getDocument(DocumentType documentType) throws InvalidDocumentTypeException;
}
