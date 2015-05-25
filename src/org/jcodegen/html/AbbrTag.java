package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class AbbrTag extends Tag<AbbrTag> {

    public AbbrTag() {
        element = new XMLElement("abbr", false);
    }

    public AbbrTag(final String body) {
        element = new XMLElement("abbr", body, false);
    }

    @Override
    protected AbbrTag getThis() {
        return this;
    }
}
