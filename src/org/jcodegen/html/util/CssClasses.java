package org.jcodegen.html.util;

import java.util.HashSet;
import java.util.Set;

/**
 * ...
 */
public class CssClasses {

    private final Set<String> classNames = new HashSet<String>();

    public void addClass(final String className) {
        classNames.add(className);
    }

    public String get() {
        if (classNames.isEmpty())
            return "";

        final StringBuilder buf = new StringBuilder();
        for (String className: classNames)
            buf.append(className).append(" ");
        buf.delete(buf.length() -1, buf.length());

        return buf.toString();
    }

    public void reset() {
        classNames.clear();
    }

    public int count() {
        return classNames.size();
    }
}
