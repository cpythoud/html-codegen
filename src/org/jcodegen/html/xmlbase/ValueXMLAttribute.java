package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public class ValueXMLAttribute extends XMLAttribute {

    public final String value;

    public ValueXMLAttribute(final String name, final String value) {
        super(name);
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder();

        buf.append(" ");
        buf.append(name);
        buf.append("=\"");
        buf.append(value);
        buf.append("\"");

        return buf.toString();
    }
}
