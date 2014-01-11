package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TfootTag extends TableElement<TfootTag> {

    public TfootTag() {
        element = new XMLElement("tfoot", false);
    }

    @Override
    protected TfootTag getThis() {
        return this;
    }

    public TfootTag child(final TrTag tr) {
        return super.child(tr);
    }
}
