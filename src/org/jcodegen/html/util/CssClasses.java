package org.jcodegen.html.util;

import java.util.HashSet;
import java.util.Set;

/**
 * ...
 */
public class CssClasses {

    private final Set<String> classNames = new HashSet<String>();

    public static CssClasses start(final String firstClass) {
        CssClasses cssClasses = new CssClasses();
        return cssClasses.add(firstClass);
    }

    public CssClasses add(final String className) {
        if (className == null || className.isEmpty())
            return this;

        classNames.add(className);

        return this;
    }

    public CssClasses add(final String className, final boolean condition) {
        if (condition)
            return add(className);

        return this;
    }

    @Deprecated
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

    public boolean isEmpty() {
        return count() == 0;
    }
}
