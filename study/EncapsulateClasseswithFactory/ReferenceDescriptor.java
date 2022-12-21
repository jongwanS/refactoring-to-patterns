package study.EncapsulateClasseswithFactory;

public class ReferenceDescriptor extends AttributeDescriptor{
    public ReferenceDescriptor() {
        super();
    }

    public ReferenceDescriptor(String name, Class parent) {
        super(name,parent);
    }
}
