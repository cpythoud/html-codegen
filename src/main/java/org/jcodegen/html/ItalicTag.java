package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class ItalicTag extends Tag<ItalicTag> {

    public ItalicTag() {
        element = new XMLElement("i", false);
    }

    public ItalicTag(final String body) {
        element = new XMLElement("i", body, false);
    }

    @Override
    protected ItalicTag getThis() {
        return this;
    }
}
