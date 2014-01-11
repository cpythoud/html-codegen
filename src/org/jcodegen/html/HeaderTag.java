package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class HeaderTag extends Tag<HeaderTag> {

    public HeaderTag(final int level, final String title) {
        if (level < 1 || level > 6)
            throw new IllegalArgumentException("In Hx header tags, we must have 1 <= x <= 6.");

        element = new XMLElement("h" + level, title, false);
    }

    @Override
    protected HeaderTag getThis() {
        return this;
    }
}
