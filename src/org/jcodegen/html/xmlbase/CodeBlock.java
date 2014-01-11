package org.jcodegen.html.xmlbase;

/**
 * ...
 */
public class CodeBlock {
    public CodeBlock(final int indentationLevel) {
        this.indentationLevel = indentationLevel;
    }

    public int getIndentationLevel() {
        return indentationLevel;
    }

    public void setIndentationLevel(final int indentationLevel) {
        this.indentationLevel = indentationLevel;
    }

    public String getTabs() {
        return getTabs(indentationLevel);
    }

    public static String getTabs(final int indentationLevel) {
        final StringBuilder buf = new StringBuilder();

        for (int i = 0; i < indentationLevel; i++)
            buf.append("\t");

        return buf.toString();
    }

    private int indentationLevel;
}
