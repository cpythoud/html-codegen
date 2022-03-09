package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class VarTag extends Tag<VarTag> {

    public VarTag() {
        element = new XMLElement("var", false);
    }

    public VarTag(final String body) {
        element = new XMLElement("var", body, false);
    }

    @Override
    protected VarTag getThis() {
        return this;
    }
}
