package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TbodyTag extends TableElement<TbodyTag> {

    public TbodyTag() {
        element = new XMLElement("tbody", false);
    }

    @Override
    protected TbodyTag getThis() {
        return this;
    }

    public TbodyTag child(final TrTag tr) {
        return super.child(tr);
    }
}
