package org.aspectj.lang.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
public @interface HideType {
	InitializationJoinpointType[] joinpoints() default { InitializationJoinpointType.PRE_INSTANCE, InitializationJoinpointType.INSTANCE, InitializationJoinpointType.CLASS, InitializationJoinpointType.WITHIN_INSTANCE, InitializationJoinpointType.WITHIN_CLASS };
}
