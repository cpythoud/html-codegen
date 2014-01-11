package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TrTag extends TableElement<TrTag> {

    public TrTag() {
        element = new XMLElement("tr", false);
    }

    @Override
    protected TrTag getThis() {
        return this;
    }

    public TrTag child(final TableCell tableCell) {
        return super.child(tableCell);
    }
}
