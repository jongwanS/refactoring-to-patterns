package study.EncapsulateClasseswithFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DescriptorTest {

    @Test
    @DisplayName("")
    public void descriptorTest(){
        Assertions.assertTrue(AttributeDescriptor.forInteger("integer", this.getClass()) instanceof DefaultDescriptor);
        Assertions.assertTrue(AttributeDescriptor.forString("string", this.getClass()) instanceof DefaultDescriptor);
        Assertions.assertTrue(AttributeDescriptor.forDate("date", this.getClass()) instanceof DefaultDescriptor);
        Assertions.assertTrue(AttributeDescriptor.forRefIntegerAndString("createdBy",this.getClass()) instanceof ReferenceDescriptor);
    }
}
