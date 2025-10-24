package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class FieldsetTag extends Tag<FieldsetTag> {

    public FieldsetTag() {
        element = new XMLElement("fieldset", false);
    }

    @Override
    protected FieldsetTag getThis() {
        return this;
    }

    public FieldsetTag name(String val) {
        return attribute("name", val);
    }

}
