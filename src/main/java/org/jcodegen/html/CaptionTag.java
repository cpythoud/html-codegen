package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class CaptionTag extends Tag<CaptionTag> {

    public CaptionTag(final String caption) {
        element = new XMLElement("caption", caption, false);
    }

    @Override
    protected CaptionTag getThis() {
        return this;
    }
}
