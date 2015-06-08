package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class SpanTag extends Tag<SpanTag> {

    public SpanTag() {
        element = new XMLElement("span", false);
    }

    public SpanTag(final String body) {
        element = new XMLElement("span", body, false);
    }

    @Override
    protected SpanTag getThis() {
        return this;
    }

    /*@Override
    public SpanTag child(final Tag tag) {
        return super.child(tag);
    }

    @Override
    public SpanTag addCodeFragment(final HtmlCodeFragment codeFragment) {
        return super.addCodeFragment(codeFragment);
    }*/
}
