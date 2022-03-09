package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class CData extends Tag<CData> {

    public CData(final String text) {
        element = new XMLElement(XMLElement.CDATA, text);
    }

    @Override
    protected CData getThis() {
        throw new IllegalArgumentException("Text data cannot be combined with attributes or child elements");
    }
}
