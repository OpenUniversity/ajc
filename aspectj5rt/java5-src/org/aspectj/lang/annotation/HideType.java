package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
public @interface HideType {
	TypeJoinpoint[] joinpoints() default { TypeJoinpoint.PRE_INIT, TypeJoinpoint.INIT, TypeJoinpoint.STATIC_INIT, TypeJoinpoint.WITHIN_INIT, TypeJoinpoint.WITHIN_STATIC_INIT };
}
