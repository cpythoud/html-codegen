package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class BrTag extends Tag<BrTag> {

    public BrTag() {
        element = new XMLElement("br");
    }

    @Override
    protected BrTag getThis() {
        throw new IllegalArgumentException("<br/> cannot be combined with attributes or child elements");
    }
}
