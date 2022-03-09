package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class MainTag extends Tag<MainTag> {

    public MainTag() {
        element = new XMLElement("main", false);
    }

    @Override
    protected MainTag getThis() {
        return this;
    }
}
