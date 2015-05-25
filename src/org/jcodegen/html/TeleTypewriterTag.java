package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TeleTypewriterTag extends Tag<TeleTypewriterTag> {

    public TeleTypewriterTag() {
        element = new XMLElement("sup", false);
    }

    public TeleTypewriterTag(final String body) {
        element = new XMLElement("sup", body, false);
    }

    @Override
    protected TeleTypewriterTag getThis() {
        return this;
    }
}
