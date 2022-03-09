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

    /*@Override
    public FieldsetTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public FieldsetTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }*/

    public FieldsetTag name(final String val) {
        return attribute("name", val);
    }
}
