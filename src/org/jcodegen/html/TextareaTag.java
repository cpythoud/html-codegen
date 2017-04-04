package org.jcodegen.html;

import org.jcodegen.html.xmlbase.XMLElement;

/**
 * ...
 */
public class TextareaTag extends FormElement<TextareaTag> {

    public TextareaTag() {
        this("");
    }

    public TextareaTag(final String content) {
        element = new XMLElement("textarea", content, false);
        element.setOnOneLine(true);
    }

    @Override
    protected TextareaTag getThis() {
        return this;
    }

    public TextareaTag cols(final int val) {
        return cols(Integer.toString(val));
    }

    public TextareaTag rows(final int val) {
        return rows(Integer.toString(val));
    }

    public TextareaTag cols(final String val) {
        return attribute("cols", val);
    }

    public TextareaTag rows(final String val) {
        return attribute("rows", val);
    }

    public TextareaTag maxlength(final String val) {
        return attribute("maxlength", val);
    }

    public TextareaTag name(final String val) {
        return attribute("name", val);
    }

    public TextareaTag readonly() {
        return attribute("readonly");
    }

    public TextareaTag placeholder(final String value) {
        return attribute("placeholder", value);
    }
}
