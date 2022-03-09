package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class SupTag extends Tag<SupTag> {

    public SupTag() {
        element = new XMLElement("sup", false);
    }

    public SupTag(final String body) {
        element = new XMLElement("sup", body, false);
    }

    @Override
    protected SupTag getThis() {
        return this;
    }
}
