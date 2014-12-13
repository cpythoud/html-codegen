package org.jcodegen.html.xmlbase;

import java.util.ArrayList;
import java.util.List;

/**
 * ...
 */
public class XMLElement extends CodeBlock {

    public final String name;
    public final String body;

    private final List<XMLAttribute> attributes = new ArrayList<XMLAttribute>();
    private final List<XMLElement> children = new ArrayList<XMLElement>();

    private final boolean selfClosing;

    private boolean onOneLine = false;

    public static final String CDATA = "CDATA";


    public XMLElement(final String name) {
        this(name, 0);
    }

    public XMLElement(final String name, final boolean selfClosing) {
        this(name, 0, selfClosing);
    }

    public XMLElement(final String name, final int indentation) {
        this(name, null, indentation);
    }

    public XMLElement(final String name, final int indentation, final boolean selfClosing) {
        this(name, null, indentation, selfClosing);
    }

    public XMLElement(final String name, final String body) {
        this(name, body, 0);
    }

    public XMLElement(final String name, final String body, final boolean selfClosing) {
        this(name, body, 0, selfClosing);
    }

    public XMLElement(final String name, final String body, final int indentation) {
        this(name, body, indentation, true);
    }

    public XMLElement(final String name, final String body, final int indentation, final boolean selfClosing) {
        super(indentation);
        this.name = name;
        this.body = body;
        this.selfClosing = selfClosing;

        if (name.equals(CDATA) && body == null)
            throw new IllegalArgumentException("CDATA element cannot be empty");
    }


    public boolean isOnOneLine() {
        return onOneLine;
    }

    public void setOnOneLine(final boolean onOneLine) {
        //System.out.println("On one line : " + name);
        this.onOneLine = onOneLine;
    }

    public void addAttribute(final XMLAttribute attribute) {
        if (hasAttribute(attribute.name))
            throw new IllegalArgumentException("XMLAttribute already defined");

        attributes.add(attribute);
    }

    public boolean hasAttribute(final String name) {
        for (XMLAttribute attribute: attributes)
            if (attribute.name.equals(name))
                return true;

        return false;
    }

    public void removeAttribute(final String name) {
        if (!hasAttribute(name))
            throw new IllegalArgumentException("Element doesn't have attribute: " + name);

        for (XMLAttribute attribute: attributes)
            if (attribute.name.equals(name)) {
                attributes.remove(attribute);
                break;
            }
    }

    public void replaceAttribute(final String name, final XMLAttribute attribute) {
        if (!attribute.name.equals(name))
            throw new IllegalArgumentException("Name of replacement attribute (" + attribute.name + ") does not match name of replaced attribute (" + name + ")");

        removeAttribute(name);
        addAttribute(attribute);
    }

    public void addChild(final XMLElement child) {
        children.add(child);
    }

    public void addChildren(final List<XMLElement> children) {
        this.children.addAll(children);
    }

    @Override
    public String toString() {
        return toString(getIndentationLevel());
    }

    public String toString(final int indentLevel) {
        return toString(indentLevel, onOneLine);
    }

    public String toString(final int indentLevel, final boolean onOneLineInherited) {
        final boolean onOneLineLocally;
        if (this.onOneLine)
            onOneLineLocally = true;
        else
            onOneLineLocally = onOneLineInherited;

        if (indentLevel < 0)
            throw new IllegalArgumentException("indentLevel < 0");

        final StringBuilder buf = new StringBuilder();

        buf.append(CodeBlock.getTabs(indentLevel));

        if (name.equals(CDATA)) {
            buf.append(body);
            if (!onOneLineLocally)
                buf.append("\n");
        } else {
            buf.append("<");
            buf.append(name);

            for (XMLAttribute attribute: attributes)
                buf.append(attribute);

            if (children.size() == 0 && body == null) {
                if (selfClosing) {
                    buf.append(" />");
                    if (!onOneLineLocally)
                        buf.append("\n");
                } else {
                    buf.append("></");
                    buf.append(name);
                    buf.append(">");
                    if (!onOneLineLocally)
                        buf.append("\n");
                }
            } else {
                buf.append(">");
                if (!onOneLineLocally)
                    buf.append("\n");

                for (XMLElement child: children)
                    buf.append(child.toString(indentLevel + 1, onOneLineLocally));

                if (body != null) {
                    if (!onOneLineLocally)
                        buf.append(CodeBlock.getTabs(indentLevel + 1));
                    buf.append(body);
                    if (!onOneLineLocally)
                        buf.append("\n");
                }

                if (!onOneLineLocally)
                    buf.append(CodeBlock.getTabs(indentLevel));
                buf.append("</");
                buf.append(name);
                buf.append(">\n");
            }
        }

        return buf.toString();
    }

    public String getOpeningTag() {
        if (name.equals(CDATA))
            throw new IllegalArgumentException("No opening tag for CDATA");

        final StringBuilder buf = new StringBuilder();
        buf.append("<");
        buf.append(name);
        for (XMLAttribute attribute: attributes)
            buf.append(attribute);
        buf.append(">");

        return buf.toString();
    }

    public String getClosingTag() {
        if (name.equals(CDATA))
            throw new IllegalArgumentException("No opening tag for CDATA");

        return "</" + name + ">";
    }
}
