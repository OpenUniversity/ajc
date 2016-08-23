package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)
public @interface HideMethod {
    MethodJoinpoint[] joinpoints() default { MethodJoinpoint.CALL, MethodJoinpoint.EXECUTION, MethodJoinpoint.WITHIN };
}
