package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public class ValueXMLAttribute extends XMLAttribute {

    public final String value;
    public final boolean useSingleQuotes;

    public ValueXMLAttribute(final String name, final String value) {
        this(name, value, false);
    }

    public ValueXMLAttribute(final String name, final String value, final boolean useSingleQuotes) {
        super(name);
        this.value = value;
        this.useSingleQuotes = useSingleQuotes;
    }

    @Override
    public String toString() {
        return " " + name + "=" + getQuotedValue();
    }

    private String getQuotedValue() {
        if (useSingleQuotes)
            return "'" + value + "'";

        return "\"" + value + "\"";
    }

    public XMLAttribute copy() {
        return new ValueXMLAttribute(name, value, useSingleQuotes);
    }
}
