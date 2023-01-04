package study.IntorucePolymorphicCreationwithFactoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCode {

    @Test
    @DisplayName("PolyMorphic Factory")
    void PolyMorphicFactory(){

        XMLBuilderTest xmlBuilderTest = new XMLBuilderTest();
        xmlBuilderTest.testAddAboveRoot();
        DomBuilderTest domBuilderTest = new DomBuilderTest();
        domBuilderTest.testAddAboveRoot();

        Assertions.assertEquals(xmlBuilderTest.testAddAboveRoot(), domBuilderTest.testAddAboveRoot());
    }
}
