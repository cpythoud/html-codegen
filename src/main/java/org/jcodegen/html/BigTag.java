package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class BigTag extends Tag<BigTag> {

    public BigTag() {
        element = new XMLElement("big", false);
    }

    public BigTag(final String body) {
        element = new XMLElement("big", body, false);
    }

    @Override
    protected BigTag getThis() {
        return this;
    }
}
