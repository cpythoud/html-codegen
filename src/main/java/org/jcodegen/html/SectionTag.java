package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class SectionTag extends Tag<SectionTag> {

    public SectionTag() {
        element = new XMLElement("section", false);
    }

    @Override
    protected SectionTag getThis() {
        return this;
    }
}
