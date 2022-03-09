package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class AcronymTag extends Tag<AcronymTag> {

    public AcronymTag() {
        element = new XMLElement("acronym", false);
    }

    public AcronymTag(final String body) {
        element = new XMLElement("acronym", body, false);
    }

    @Override
    protected AcronymTag getThis() {
        return this;
    }
}
