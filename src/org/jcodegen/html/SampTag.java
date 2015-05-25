package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class SampTag extends Tag<SampTag> {

    public SampTag() {
        element = new XMLElement("samp", false);
    }

    public SampTag(final String body) {
        element = new XMLElement("samp", body, false);
    }

    @Override
    protected SampTag getThis() {
        return this;
    }
}
