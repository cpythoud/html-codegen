package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class BoldTag extends Tag<BoldTag> {

    public BoldTag() {
        element = new XMLElement("b", false);
    }

    public BoldTag(final String body) {
        element = new XMLElement("b", body, false);
    }

    @Override
    protected BoldTag getThis() {
        return this;
    }
}
