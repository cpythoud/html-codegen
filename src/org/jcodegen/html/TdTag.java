package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TdTag extends TableCell<TdTag> {

    public TdTag() {
        element = new XMLElement("td", false);
    }

    public TdTag(final String body) {
        element = new XMLElement("td", body, false);
    }

    @Override
    protected TdTag getThis() {
        return this;
    }
}
