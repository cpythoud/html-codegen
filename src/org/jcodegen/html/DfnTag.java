package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class DfnTag extends Tag<DfnTag> {

    public DfnTag() {
        element = new XMLElement("dfn", false);
    }

    public DfnTag(final String body) {
        element = new XMLElement("dfn", body, false);
    }

    @Override
    protected DfnTag getThis() {
        return this;
    }
}
