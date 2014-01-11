package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class DivTag extends Tag<DivTag> {

    public DivTag() {
        element = new XMLElement("div", false);
    }

    @Override
    protected DivTag getThis() {
        return this;
    }

    @Override
    public DivTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public DivTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }
}
