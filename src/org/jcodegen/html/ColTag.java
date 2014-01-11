package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class ColTag extends ColElement<ColTag> {

    public ColTag() {
        element = new XMLElement("coltag", false);
    }

    public ColTag(final int span) {
        this();
        span(span);
    }

    @Override
    protected ColTag getThis() {
        return this;
    }
}
