package study.EncapsulateClasseswithFactory;

import java.sql.Date;

public abstract class AttributeDescriptor {

    private String name;
    private Class parentType;
    private Class type;

    protected AttributeDescriptor(String name, Class parentType, Class type) {
        this.name = name;
        this.parentType = parentType;
        this.type = type;
    }

    public AttributeDescriptor(String name, Class parent) {
        this.name = name;
        this.parentType = parent;
    }

    public AttributeDescriptor() {
    }


    public static AttributeDescriptor forRefIntegerAndString(String name, Class parent) {
        return new ReferenceDescriptor(name,parent);
    }

    public static AttributeDescriptor forInteger(String str, Class parent){
        return new DefaultDescriptor(str, parent, Integer.TYPE);
    }

    public static AttributeDescriptor forDate(String str, Class parent){
        return new DefaultDescriptor(str, parent, Date.class);
    }

    public static AttributeDescriptor forString(String str, Class parent){
        return new DefaultDescriptor(str, parent, String.class);
    }
}
