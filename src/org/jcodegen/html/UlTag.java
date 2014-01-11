package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class UlTag extends Tag<UlTag> {

    public UlTag() {
        element = new XMLElement("ul", false);
    }

    @Override
    protected UlTag getThis() {
        return this;
    }

    @Override
    public UlTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public UlTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }
}
