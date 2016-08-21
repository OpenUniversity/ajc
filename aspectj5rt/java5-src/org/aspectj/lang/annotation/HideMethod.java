package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)
public @interface HideMethod {
    MethodJoinpointType[] joinpoints() default { MethodJoinpointType.CALL, MethodJoinpointType.EXECUTION, MethodJoinpointType.ALL_WITHIN };
}
