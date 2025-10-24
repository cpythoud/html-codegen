package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class LegendTag extends Tag<LegendTag> {

    public LegendTag() {
        element = new XMLElement("legend", false);
    }

    public LegendTag(String body) {
        element = new XMLElement("legend", body, false);
    }

    @Override
    protected LegendTag getThis() {
        return this;
    }

}
