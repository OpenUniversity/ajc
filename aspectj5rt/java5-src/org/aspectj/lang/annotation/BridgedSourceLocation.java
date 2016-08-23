package org.aspectj.lang.annotation;

public @interface BridgedSourceLocation {
    public String file();
    public int line();
    public String module();
}

