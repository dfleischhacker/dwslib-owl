package de.uni_mannheim.informatik.dws.dwslib.owl;

import org.semanticweb.owlapi.model.IRI;

/**
 * Utilities for working with OWLAPI ontologies
 * @author Daniel Fleischhacker
 */
public class OntologyUtil {

    /**
     * Returns the entity name from the given IRI. It first tries to find the part behind hash in the IRI,
     * if there is no hash in the IRI, the part following the last / is used. If no / is contained in the
     * IRI the whole IRI is returned as string.
     *
     * @param iri the IRI to get entity name from
     * @return entity name if found, otherwise null
     */
    public static String getEntityName(IRI iri) {
        String entityName = iri.getFragment();
        if (entityName == null) {
            String[] elements = iri.toString().split("/");
            if (elements.length >= 1) {
                entityName = elements[elements.length - 1];
            }
        }
        return entityName;
    }
}
