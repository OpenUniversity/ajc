package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HideMethod {
    MethodJoinpointType[] joinpoints() default { MethodJoinpointType.EXECUTION, MethodJoinpointType.CALL };
    boolean hideJoinpointsWithin() default true;
}
