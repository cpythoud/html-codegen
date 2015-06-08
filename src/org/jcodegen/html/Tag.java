package org.jcodegen.html;

import org.jcodegen.html.xmlbase.BooleanXMLAttribute;
import org.jcodegen.html.xmlbase.XMLElement;
import org.jcodegen.html.xmlbase.ValueXMLAttribute;

/**
 * ...
 */
public abstract class Tag <T extends Tag<T>> {

    private int indentationLevel = 0;

    protected XMLElement element;

    protected abstract T getThis();


    public int getIndentationLevel() {
        return indentationLevel;
    }

    public void setIndentationLevel(final int indentationLevel) {
        this.indentationLevel = indentationLevel;
    }


    public T id(final String value) {
        return attribute("id", value);
    }

    public T cssClass(final String value) {
        return attribute("class", value);
    }

    public T changeCssClasses(final String value) {
        element.replaceAttribute("class", new ValueXMLAttribute("class", value));
        return getThis();
    }

    public T title(final String value) {
        return attribute("title", value);
    }

    public T style(final String value) {
        return attribute("style", value);
    }

    public T dir(final String value) {
        return attribute("dir", value);
    }

    public T lang(final String value) {
        return attribute("lang", value);
    }

    public T disabled() {
        return attribute("disabled");
    }

    public T tabindex(final int value) {
        return attribute("tabindex", Integer.toString(value));
    }

    public T role(final String value) {
        return attribute("role", value);
    }

    public T data(final String name, final String value) {
        return attribute("data-" + name, value);
    }

    public T attribute(final String name) {
        element.addAttribute(new BooleanXMLAttribute(name));
        return getThis();
    }

    public T attribute(final String name, final String value) {
        element.addAttribute(new ValueXMLAttribute(name, value != null ? value : ""));
        return getThis();
    }

    public T singleQuotedAttribute(final String name, final String value) {
        element.addAttribute(new ValueXMLAttribute(name, value != null ? value : "", true));
        return getThis();
    }


    public T child(final Tag tag) {
        element.addChild(tag.element);
        return getThis();
    }

    public T addCodeFragment(final HtmlCodeFragment codeFragment) {
        for (Tag tag: codeFragment.getTags())
            child(tag);
        return getThis();
    }


    @Override
    public String toString() {
        return element.toString(indentationLevel);
    }

    public String toString(final int indentationLevel) {
        return element.toString(indentationLevel);
    }


    public String getOpeningTag() {
        return element.getOpeningTag();
    }

    public String getClosingTag() {
        return element.getClosingTag();
    }
}
