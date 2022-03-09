package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class AddressTag extends Tag<AddressTag> {

    public AddressTag() {
        element = new XMLElement("address", false);
    }

    public AddressTag(final String body) {
        element = new XMLElement("address", body, false);
    }

    @Override
    protected AddressTag getThis() {
        return this;
    }
}
