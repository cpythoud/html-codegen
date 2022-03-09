package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class CodeTag extends Tag<CodeTag> {

    public CodeTag() {
        element = new XMLElement("code", false);
    }

    public CodeTag(final String body) {
        element = new XMLElement("code", body, false);
    }

    @Override
    protected CodeTag getThis() {
        return this;
    }
}
