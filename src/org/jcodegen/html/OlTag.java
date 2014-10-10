package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

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

    @Override
    public OlTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public OlTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }
}
