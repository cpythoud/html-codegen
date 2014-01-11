package org.jcodegen.html;

/**
 * ...
 */
public enum HAlign {
    LEFT("left"),
    CENTER("center"),
    JUSTIFY("justify"),
    CHAR("char");

    private final String val;

    private HAlign(final String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
