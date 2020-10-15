package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

public class DdTag extends Tag<DdTag> {

    public DdTag() {
        element = new XMLElement("dd", false);
    }

    public DdTag(String body) {
        element = new XMLElement("dd", body, false);
    }

    @Override
    protected DdTag getThis() {
        return this;
    }
}
