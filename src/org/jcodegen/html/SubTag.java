package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class SubTag extends Tag<SubTag> {

    public SubTag() {
        element = new XMLElement("sub", false);
    }

    public SubTag(final String body) {
        element = new XMLElement("sub", body, false);
    }

    @Override
    protected SubTag getThis() {
        return this;
    }
}
