package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
public @interface HideType {
	TypeJoinpoint[] joinpoints() default { TypeJoinpoint.PRE_INSTANCE, TypeJoinpoint.INSTANCE, TypeJoinpoint.CLASS, TypeJoinpoint.WITHIN_INSTANCE, TypeJoinpoint.WITHIN_CLASS };
}
