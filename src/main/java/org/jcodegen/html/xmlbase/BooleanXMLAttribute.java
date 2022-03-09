package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public class BooleanXMLAttribute extends XMLAttribute {

    public BooleanXMLAttribute(final String name) {
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
