package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class StrongTag extends Tag<StrongTag> {

    public StrongTag() {
        element = new XMLElement("strong", false);
    }

    public StrongTag(final String body) {
        element = new XMLElement("strong", body, false);
    }

    @Override
    protected StrongTag getThis() {
        return this;
    }

    @Override
    public StrongTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public StrongTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }
}
