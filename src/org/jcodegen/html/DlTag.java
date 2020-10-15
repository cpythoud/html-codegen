package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

public class DlTag extends Tag<DlTag> {

    public DlTag() {
        element = new XMLElement("dl", false);
    }

    @Override
    protected DlTag getThis() {
        return this;
    }
}
