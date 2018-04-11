package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

import java.util.List;

/**
 * ...
 */
public class OlTag extends Tag<OlTag> {

    public OlTag() {
        element = new XMLElement("ol", false);
    }

    @Override
    protected OlTag getThis() {
        return this;
    }

    public static OlTag createList(final List<Object> items) {
        if (items == null)
            throw new NullPointerException("Item List is null");
        if (items.isEmpty())
            throw new IllegalArgumentException("Item list is empty");

        return createList(new OlTag(), items);
    }
}
