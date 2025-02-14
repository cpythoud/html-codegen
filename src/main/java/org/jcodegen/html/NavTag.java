package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

public class NavTag extends Tag<NavTag> {

    public NavTag() {
        element = new XMLElement("nav", false);
    }

    @Override
    protected NavTag getThis() {
        return this;
    }

}
