package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class EmTag extends Tag<EmTag> {

    public EmTag() {
        element = new XMLElement("em", false);
    }

    public EmTag(final String body) {
        element = new XMLElement("em", body, false);
    }

    @Override
    protected EmTag getThis() {
        return this;
    }
}
