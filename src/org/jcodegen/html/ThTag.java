package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class ThTag extends TableCell<ThTag> {

    public ThTag() {
        element = new XMLElement("th", false);
    }

    public ThTag(final String body) {
        element = new XMLElement("th", body, false);
    }

    @Override
    protected ThTag getThis() {
        return this;
    }
}
