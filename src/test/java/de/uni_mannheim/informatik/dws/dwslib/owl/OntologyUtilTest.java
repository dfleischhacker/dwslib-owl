package de.uni_mannheim.informatik.dws.dwslib.owl;

import org.junit.Assert;
import org.junit.Test;
import org.semanticweb.owlapi.model.IRI;

/**
 *
 */
public class OntologyUtilTest {
    @Test
    public void testGetEntityName() throws Exception {
        Assert.assertEquals(OntologyUtil.getEntityName(IRI.create("http://dbpedia.org/ontology/Person")), "Person");
        Assert.assertEquals(OntologyUtil.getEntityName(IRI.create("http://dbpedia.org/ontology#Person")), "Person");
        Assert.assertEquals(OntologyUtil.getEntityName(IRI.create("TestPerson")), "TestPerson");
        Assert.assertEquals(OntologyUtil.getEntityName(IRI.create("")), "");
    }
}
