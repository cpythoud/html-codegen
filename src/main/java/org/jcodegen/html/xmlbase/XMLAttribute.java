package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public abstract class XMLAttribute {

    public final String name;

    public XMLAttribute(final String name) {
        this.name = name;
    }

    public abstract  XMLAttribute copy();
}
