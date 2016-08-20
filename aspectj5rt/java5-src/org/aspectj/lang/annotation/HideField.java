package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.FIELD)
public @interface HideField {
    FieldJoinpointType[] joinpoints() default { FieldJoinpointType.SET, FieldJoinpointType.GET };
}
