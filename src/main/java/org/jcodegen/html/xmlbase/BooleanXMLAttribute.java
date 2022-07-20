package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public class BooleanXMLAttribute extends XMLAttribute {

    public BooleanXMLAttribute(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " " + name;
    }

    @Override
    public XMLAttribute copy() {
        return new BooleanXMLAttribute(name);
    }

}
